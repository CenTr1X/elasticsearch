package api.model;

import java.util.Map;
import java.util.HashMap;

public class Options {
    private Map<String, String> options;

    public Options() {
        options = new HashMap<>();
    }

    public Options(Map<String, String> options) {
        this.options = options;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public void addOption(String key, String value) {
        options.put(key, value);
    }
}
