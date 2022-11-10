package api.model;

import java.util.List;

public class CreateIndexRequest {
    private int requestId;

    private String indexName;

    private List<Option> options;

    public CreateIndexRequest(int requestId, String indexName, List<Option> options) {
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    
}
