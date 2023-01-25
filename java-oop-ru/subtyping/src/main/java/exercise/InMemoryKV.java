package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage{

    private Map<String, String> map;

    public InMemoryKV(Map<String, String> map){
        this.map = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> map2 = new HashMap<>(map);
        map2.put(key, value);
        map = map2;
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        String result = null;
        for (Map.Entry<String, String> entry : map.entrySet()){

            if (map.containsKey(key)){
                if (entry.getKey().equals(key)){
                    result = entry.getValue();
                }
            }else {
                result =  defaultValue;
            }
        }
        return result;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }

    @Override
    public void swapKeyValue(){
        Map<String, String> map2 = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()){

            String key = entry.getKey();
            String value = entry.getValue();

            map2.put(value, key);
        }
        map = map2;
    }
}
// END
