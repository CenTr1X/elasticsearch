package api.model;

import java.util.List;

public class TestResponse {
    private int id;

    private String text;

    private List<TestResult> l; 

    public TestResponse(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<TestResult> getL() {
        return l;
    }

    public void setL(List<TestResult> l) {
        this.l = l;
    }
}
