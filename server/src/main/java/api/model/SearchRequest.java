package api.model;

import java.util.List;

public class SearchRequest {
    private int requestId;

    private int indexId;

    private Statement statement;

    private List<Option> options;

    public SearchRequest(int requestId, int indexId, Statement statement, List<Option> options) {
        this.requestId = requestId;
        this.indexId = indexId;
        this.statement = statement;
        this.options = options;
    }

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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
