package api.model;

import java.util.List;

public class FetchRequest {
    private int requestId;

    private List<String> indicesName;

    private int searchRequestId;

    private List<Integer> docIds;
    
    private List<Option> options;

    public FetchRequest(int requestId, List<String> indicesName, int searchRequestId, List<Integer> docIds,
            List<Option> options) {
        this.requestId = requestId;
        this.indicesName = indicesName;
        this.searchRequestId = searchRequestId;
        this.docIds = docIds;
        this.options = options;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public List<String> getIndicesName() {
        return indicesName;
    }

    public void setIndicesName(List<String> indicesName) {
        this.indicesName = indicesName;
    }

    public int getSearchRequestId() {
        return searchRequestId;
    }

    public void setSearchRequestId(int searchRequestId) {
        this.searchRequestId = searchRequestId;
    }

    public List<Integer> getDocIds() {
        return docIds;
    }

    public void setDocIds(List<Integer> docIds) {
        this.docIds = docIds;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    
}
