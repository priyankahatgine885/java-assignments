package ctrlstmt.strings;

import java.util.HashMap;
import java.util.Map;
/*
Display words along with their occurences.
Input: "this is test time or this is the best time".
Output:
this: 2
is: 2
test: 1
time: 2
or: 1
the: 1
best: 1
 */
public class Example01 {
    public static void main(String[] args) {
        String input = "this is test time or this is the best time";
        String[] str = extractWords(input);
        Map<String, Integer> stringCountMap = processData(str);
        printFrequencyOfEachWordMap(stringCountMap);
    }

    public static String[] extractWords(String text) {
        String[] words = text.split(" ");
        return words;
    }

    public static Map<String, Integer> processData(String[] words) {
        Map<String, Integer> stringCountMap = new HashMap<>();
        for (String word : words) {
            String wordss = word;
            if (stringCountMap.containsKey(word)) {
                int count = stringCountMap.get(word);
                stringCountMap.put(word, count + 1);
            } else {
                stringCountMap.put(word, 1);
            }
        }
        return stringCountMap;
    }

    public static void printFrequencyOfEachWordMap(Map<String, Integer> stringCountMap) {
        for (String key : stringCountMap.keySet()) {
            Integer count = stringCountMap.get(key);
            System.out.println("Key: " + key + " " + "Value: " + count);
        }
    }
}
