package api.model;

import java.util.List;

public class DeleteRequest {
    private int requestId;

    private String indexName;

    private int docId;

    private List<Option> options;

    public DeleteRequest(int requestId, String indexName, int docId, List<Option> options) {
        this.requestId = requestId;
        this.indexName = indexName;
        this.docId = docId;
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    
}
