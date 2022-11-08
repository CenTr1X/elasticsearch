package api.model;

import java.util.Map;

public class TestRequest {
    private int id;

    private String text;

    private Map<Integer, Integer> l; 

    public TestRequest(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, Integer> getL() {
        return l;
    }

    public void setL(Map<Integer, Integer> l) {
        this.l = l;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
