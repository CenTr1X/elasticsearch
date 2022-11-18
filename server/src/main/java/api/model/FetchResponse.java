package api.model;

import java.util.List;

import api.model.FetchResult;

public class FetchResponse {
    private int fetchRequestId;

    private List<FetchResult> results;

    public FetchResponse(int fetchRequestId, List<FetchResult> results) {
        this.fetchRequestId = fetchRequestId;
        this.results = results;
    }

    public int getFetchRequestId() {
        return fetchRequestId;
    }

    public void setFetchRequestId(int fetchRequestId) {
        this.fetchRequestId = fetchRequestId;
    }

    public List<FetchResult> getResults() {
        return results;
    }

    public void setResults(List<FetchResult> results) {
        this.results = results;
    }

    
}
