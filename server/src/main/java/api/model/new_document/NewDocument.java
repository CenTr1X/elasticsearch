package api.model.new_document;

public class NewDocument {
    private String doc_id;

    public NewDocument(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
}
