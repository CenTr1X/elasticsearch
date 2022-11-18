package api.model;

public class DeleteResponse {
    private int deleteRequestId;

    private DeleteResult result;

    public DeleteResponse(int deleteRequestId, DeleteResult result) {
        this.deleteRequestId = deleteRequestId;
        this.result = result;
    }

    public int getDeleteRequestId() {
        return deleteRequestId;
    }

    public void setDeleteRequestId(int deleteRequestId) {
        this.deleteRequestId = deleteRequestId;
    }

    public DeleteResult getResult() {
        return result;
    }

    public void setResult(DeleteResult result) {
        this.result = result;
    }
    
}
