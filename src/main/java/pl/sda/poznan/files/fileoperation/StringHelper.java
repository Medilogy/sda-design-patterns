package pl.sda.poznan.files.fileoperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringHelper {

    public static Map<String, Integer> getWordsMap(List<String> words) {
        Map<String, Integer> results = new HashMap<>();
        for (String word : words) {
            if (results.containsKey(word)) {
                Integer oldCount = results.get(word);
                results.put(word, ++oldCount);
            } else {
                results.put(word, 1);
            }
        }
        return results;
    }
}
