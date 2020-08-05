package counting.letters;

import java.util.Map;
import java.util.TreeMap;

public class CountingLetters {

    public static Map<String, Integer> countLetters(String sentence) throws CountingLettersException{
        if (sentence == null) {
            throw new CountingLettersException("Are you okay?");
        }
        Map<String, Integer> result = new TreeMap<String, Integer>();
        for (char letter : sentence.toCharArray()) {
            String theLetter = String.valueOf(letter);
            if (result.containsKey(theLetter)) {
                int count = result.get(theLetter);
                count++;
                result.put(String.valueOf(theLetter),count);
            } else {
                result.put(String.valueOf(theLetter), 1);
            }
        }
        return result;
    }
}

