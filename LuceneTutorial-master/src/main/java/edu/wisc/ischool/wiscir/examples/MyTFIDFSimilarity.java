package edu.wisc.ischool.wiscir.examples;

import org.apache.lucene.search.similarities.TFIDFSimilarity;

public class MyTFIDFSimilarity extends TFIDFSimilarity {

    @Override
    public float tf(float freq) {
        return freq;
    }

    @Override
    public float idf(long docFreq, long docCount) {
        return (float) Math.log(1 + (docCount - docFreq + 0.5D) / (docFreq + 0.5D));
    }

    @Override
    public float lengthNorm(int length) {
        return 1.0F;
    }
}