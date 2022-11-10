package api.model;

import java.util.List;

public class SearchResponse {
    private int searchRequestId;

    private List<SearchResult> results;

    public int getSearchRequestId() {
        return searchRequestId;
    }

    public void setSearchRequestId(int searchRequestId) {
        this.searchRequestId = searchRequestId;
    }

    public List<SearchResult> getResults() {
        return results;
    }

    public void setResult(List<SearchResult> results) {
        this.results = results;
    }
}
