package api.model;

import api.model.new_document.*;

public class PutRequest {
    private NewDocument doc;

    public NewDocument getDoc() {
        return doc;
    }

    public void setDoc(NewDocument doc) {
        this.doc = doc;
    }

    public PutRequest(NewDocument doc) {
        this.doc = doc;
    }
}