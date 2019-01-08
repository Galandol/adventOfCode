package pl.advent;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kmosiej
 * @since 2019-01-08
 */
public class Day2 implements ActivistDay2 {

    @Override
    public boolean checkForTwos(String row) {
        Map<Character, Long> map = count(row);

        return map.values().contains(2L);
    }

    @Override
    public boolean checkForThrees(String row) {
        Map<Character, Long> map = count(row);

        return map.values().contains(3L);
    }

    private Map<Character, Long> count(String row) {
        Map<Character, Long> map = new HashMap<>();

        char[] chars = row.toCharArray();

        for (char aChar : chars) {
            if (map.keySet().contains(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1L);
            }
        }
        return map;
    }
}
