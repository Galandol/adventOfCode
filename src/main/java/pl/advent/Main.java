package pl.advent;

import java.util.List;

/**
 *
 * @author kmosiej
 * @since 2019-01-07
 */
public class Main {

    public static void main(String[] args) {

        Day1 day1 = new Day1();

        long result = 0;

        List<String> stringList = day1.prepareInputList();

        for (String row : stringList) {
            if (day1.decideIfAdd(row)) {
                result = day1.add(result, Long.parseLong(row.substring(1)));
            } else {
                result = day1.subtract(result, Long.parseLong(row.substring(1)));
            }
        }

        System.out.println("result: " + result);
    }

}
