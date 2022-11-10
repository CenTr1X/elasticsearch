package api.model;

public class DeleteIndexResponse {
    private int DeleteIndexRequestId;

    private DeleteIndexResult result;

    public DeleteIndexResponse(int deleteIndexRequestId, DeleteIndexResult result) {
        DeleteIndexRequestId = deleteIndexRequestId;
        this.result = result;
    }

    public int getDeleteIndexRequestId() {
        return DeleteIndexRequestId;
    }

    public void setDeleteIndexRequestId(int deleteIndexRequestId) {
        DeleteIndexRequestId = deleteIndexRequestId;
    }

    public DeleteIndexResult getResult() {
        return result;
    }

    public void setResult(DeleteIndexResult result) {
        this.result = result;
    }

    
}
