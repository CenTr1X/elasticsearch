package api.model.document;

import java.util.List;

public class Data {
    private String rawData;

    private List<String> token;

    public Data(String rawData, List<String> token) {
        this.rawData = rawData;
        this.token = token;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public List<String> getToken() {
        return token;
    }

    public void setToken(List<String> token) {
        this.token = token;
    }

    
}
