package api.model.document;


public class Document {
    private int docId;

    private DocumentData data;

    private double score;

    public Document(int docId, DocumentData data, double score) {
        this.docId = docId;
        this.data = data;
        this.score = score;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public DocumentData getData() {
        return data;
    }

    public void setData(DocumentData data) {
        this.data = data;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
