package api.model;

import java.util.List;

public class IndexRequest {
    private int requestId;

    private String indexName;

    private int docId;

    private Document document;

    private List<Option> options;

    public IndexRequest(int requestId, String indexName, int docId, Document document, List<Option> options) {
        this.requestId = requestId;
        this.indexName = indexName;
        this.docId = docId;
        this.document = document;
        this.options = options;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    
}
