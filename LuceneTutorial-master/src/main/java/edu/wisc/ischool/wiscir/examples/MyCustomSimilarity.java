import org.apache.lucene.search.similarities.BasicModel;
import org.apache.lucene.search.similarities.SimilarityBase;

public class MyCustomSimilarity extends SimilarityBase {

    public MyCustomSimilarity() {}

    @Override
    protected float score(BasicStats stats, float freq, float docLen) {
        float alpha = 0.5f;
        float numerator = (1 - alpha) * freq;
        float denominator = alpha * docLen + (1 - alpha);
        return stats.getBoost() * (float) (numerator / denominator);
    }

    @Override
    public String toString() {
        return "CustomBasicModelIn";
    }

}