package api.model;

public class IndexResponse {
    private int indexRequestId;

    private IndexResult result;
    
    public IndexResponse(int indexRequestId, IndexResult result) {
        this.indexRequestId = indexRequestId;
        this.result = result;
    }

    public int getIndexRequestId() {
        return indexRequestId;
    }

    public void setIndexRequestId(int indexRequestId) {
        this.indexRequestId = indexRequestId;
    }

    public IndexResult getResult() {
        return result;
    }

    public void setResult(IndexResult result) {
        this.result = result;
    }

    
}
