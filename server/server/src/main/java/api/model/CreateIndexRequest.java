package api.model;

public class CreateIndexRequest {
    private int requestId;

    private String indexName;

    private Options options;

    public CreateIndexRequest(int requestId, String indexName, Options options) {
        this.requestId = requestId;
        this.indexName = indexName;
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

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    
}
