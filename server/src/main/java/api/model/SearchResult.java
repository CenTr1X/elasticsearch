package api.model;

public class SearchResult {
    private int doc_id;

    private double score;

    public SearchResult(int doc_id, double score) {
        this.doc_id = doc_id;
        this.score = score;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}
