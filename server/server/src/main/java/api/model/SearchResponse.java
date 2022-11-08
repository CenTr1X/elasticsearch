package api.model;


public class SearchResponse {
    private int searchRequestId;

    private SearchResult result;

    public int getSearchRequestId() {
        return searchRequestId;
    }

    public void setSearchRequestId(int searchRequestId) {
        this.searchRequestId = searchRequestId;
    }

    public SearchResult getResult() {
        return result;
    }

    public void setResult(SearchResult result) {
        this.result = result;
    }
}
