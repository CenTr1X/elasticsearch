package api.model;

public class SearchRequest {
    private int requestId;

    private int indexId;

    private Statement statement;

    private Options options;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public SearchRequest(int requestId, int indexId, Statement statement, Options options) {
        this.requestId = requestId;
        this.indexId = indexId;
        this.statement = statement;
        this.options = options;
    }


}
