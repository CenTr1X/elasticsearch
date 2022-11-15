package api.model;

import java.util.List;

public class SearchRequest {
    private int requestId;

    private List<String> indicesName;

    private String source;

    private List<Option> options;

    public SearchRequest(int requestId, List<String> indicesName, String source, List<Option> options) {
        this.requestId = requestId;
        this.indicesName = indicesName;
        this.source = source;
        this.options = options;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getIndicesName() {
        return indicesName;
    }

    public void setIndicesName(List<String> indicesName) {
        this.indicesName = indicesName;
    }
}
