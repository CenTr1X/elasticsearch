package api.model.document;

public class Content {
    private String field;

    private Data data;

    public Content(String field, Data data) {
        this.field = field;
        this.data = data;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    
}
