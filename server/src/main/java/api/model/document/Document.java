package api.model.document;


public class Document {
    private int docId;

    private DocumentData data;

    private int score;

    public Document(int docId, DocumentData data, int score) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
