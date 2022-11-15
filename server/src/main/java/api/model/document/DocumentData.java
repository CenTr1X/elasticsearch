package api.model.document;

import java.util.List;

public class DocumentData {
    private List<Content> contents;

    private List<Mapping> mappings;

    public DocumentData(List<Content> contents, List<Mapping> mappings) {
        this.contents = contents;
        this.mappings = mappings;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public List<Mapping> getMappings() {
        return mappings;
    }

    public void setMappings(List<Mapping> mappings) {
        this.mappings = mappings;
    }


}
