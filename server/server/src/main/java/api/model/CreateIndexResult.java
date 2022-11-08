package api.model;

public class CreateIndexResult {
    private boolean success;

    private String error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public CreateIndexResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
