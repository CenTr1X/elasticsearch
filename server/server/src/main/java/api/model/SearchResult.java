package api.model;

import java.util.Map;

public class SearchResult {
    private Map<Integer, Integer> resultList;

    public Map<Integer, Integer> getResultList() {
        return resultList;
    }

    public void setResultList(Map<Integer, Integer> resultList) {
        this.resultList = resultList;
    }
}
