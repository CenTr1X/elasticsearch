package api.model.new_document;

import java.util.Map;

public class NewDocumentData {
    private PostingList posting;
    private String raw_text;
    private Map<String, DocField> field_map;
    private Map<String, DocField> field_map2;
    
    public NewDocumentData(String raw_text) {
        this.raw_text = raw_text;
    }

    public PostingList getPosting() {
        return posting;
    }
    public void setPosting(PostingList posting) {
        this.posting = posting;
    }
    public String getRaw_text() {
        return raw_text;
    }
    public void setRaw_text(String raw_text) {
        this.raw_text = raw_text;
    }
    public Map<String, DocField> getField_map() {
        return field_map;
    }
    public void setField_map(Map<String, DocField> field_map) {
        this.field_map = field_map;
    }
    public Map<String, DocField> getField_map2() {
        return field_map2;
    }
    public void setField_map2(Map<String, DocField> field_map2) {
        this.field_map2 = field_map2;
    }

    
}
