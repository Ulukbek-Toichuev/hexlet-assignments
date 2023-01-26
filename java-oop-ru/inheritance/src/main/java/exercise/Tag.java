package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag{

    private String tagName;
    private Map<String, String> attribute;

    public Tag(String tagName, Map<String, String> attribute){
        this.tagName = tagName;
        this.attribute = attribute;
    }
}
// END
