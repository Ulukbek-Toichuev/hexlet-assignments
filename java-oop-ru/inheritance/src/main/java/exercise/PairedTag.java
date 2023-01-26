package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{

    private String tagName;
    private Map<String, String> attribute;
    private String tagBody;
    private List<Tag> child;

    public PairedTag(String tagName, Map<String, String> attribute, String tagBody, List<Tag> child){
        super(tagName, attribute);

        this.tagName = tagName;
        this.attribute = attribute;
        this.tagBody = tagBody;
        this.child = child;
    }


    @Override
    public String toString() {
        StringBuilder toStringTag = new StringBuilder();

        toStringTag.append("<"+tagName);

        for (Map.Entry<String, String> entry : attribute.entrySet()){
            toStringTag.append(" ").append(entry.getKey()).append("=")
                    .append("\"").append(entry.getValue()).append("\"");
        }

        toStringTag.append(">").append(tagBody);

        for (int i = 0; i < child.size(); i++){
            toStringTag.append(child.get(i).toString());
        }
        toStringTag.append("</"+tagName+">");

        return toStringTag.toString();
    }

}
// END
