package api.model;

public class CreateIndexResponse {
    private int createIndexRequestId;

    private CreateIndexResult result;

    public int getCreateIndexRequestId() {
        return createIndexRequestId;
    }

    public void setCreateIndexRequestId(int createIndexRequestId) {
        this.createIndexRequestId = createIndexRequestId;
    }

    public CreateIndexResult getResult() {
        return result;
    }

    public void setResult(CreateIndexResult result) {
        this.result = result;
    }

    public CreateIndexResponse(int createIndexRequestId, CreateIndexResult result) {
        this.createIndexRequestId = createIndexRequestId;
        this.result = result;
    }

}
