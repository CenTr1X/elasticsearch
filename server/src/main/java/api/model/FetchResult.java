package api.model;

import api.model.document.*;

public class FetchResult {
    private int docId;

    private Document doc;

    public FetchResult(int docId, Document doc) {
        this.docId = docId;
        this.doc = doc;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    
}
