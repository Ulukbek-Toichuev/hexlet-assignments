package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag{
    private String tagName;
    private Map<String, String> attribute;

    public SingleTag(String tagName, Map<String, String> attribute) {
        super(tagName, attribute);
        this.attribute = attribute;
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("<"+tagName);
        for (Map.Entry<String, String> entry : attribute.entrySet()){
            sb.append(" ").append(entry.getKey()).append("=").append("\"").append(entry.getValue())
                    .append("\"");}
        sb.append(">");

        return sb.toString();
    }
}
// END
