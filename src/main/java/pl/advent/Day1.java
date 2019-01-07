package pl.advent;

import pl.advent.ActivistDay1;

/**
 *
 * Zadanie z pierwszego dnia
 *
 * @author kmosiej
 * @since 2019-01-07
 */
public class Day1 implements ActivistDay1 {

    @Override
    public long add(long result, long number) {
        return result + number;
    }

    @Override
    public long subtract(long result, long number) {
        return result - number;
    }

    @Override
    public boolean decideIfAdd(String row) {
        char adding = '+';
        char firstChar = row.charAt(0);

        return adding == firstChar;
    }
}
