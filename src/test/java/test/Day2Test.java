package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import pl.advent.Day2;

/**
 *
 * @author kmosiej
 * @since 2019-01-08
 */
public class Day2Test {

    Day2 testClass;

    private Day2 prepareTestClass() {
        return new Day2();
    }

    /**
     * W danym wierszu mamy dokładnie jedną parę liter
     * Powinniśmy otrzymać prawdę.
     */
    @Test
    public void checkForTwos_oneTwoInRow() {

        // given
        testClass = prepareTestClass();

        String row = "abcb";

        // when
        boolean result = testClass.checkForTwos(row);

        // then
        assertEquals(true, result);
    }

    /**
     * W danym wierszu mamy kilka par liter
     * Powinniśmy otrzymać prawdę.
     */
    @Test
    public void checkForTwos_manyTwosInRow() {

        // given
        testClass = prepareTestClass();

        String row = "acbecb";

        // when
        boolean result = testClass.checkForTwos(row);

        // then
        assertEquals(true, result);
    }

    /**
     * W danym wierszu mamy parę i trójkę liter
     * Powinniśmy otrzymać prawdę.
     */
    @Test
    public void checkForTwos_twoAndThreeInRow() {

        // given
        testClass = prepareTestClass();

        String row = "abcibcwec";

        // when
        boolean result = testClass.checkForTwos(row);

        // then
        assertEquals(true, result);
    }

    /**
     * W danym wierszu nie mamy par liter
     * Powinniśmy otrzymać fałsz.
     */
    @Test
    public void checkForTwos_noTwosInRow() {

        // given
        testClass = prepareTestClass();

        String row = "acrhnztq";

        // when
        boolean result = testClass.checkForTwos(row);

        // then
        assertEquals(false, result);
    }

    /**
     * W danym wierszu mamy trójkę liter
     * Powinniśmy otrzymać fałsz.
     */
    @Test
    public void checkForTwos_treeInRow() {

        // given
        testClass = prepareTestClass();

        String row = "acrhcctq";

        // when
        boolean result = testClass.checkForTwos(row);

        // then
        assertEquals(false, result);
    }

    /**
     * W danym wierszu mamy trójkę liter
     * Powinniśmy otrzymać prawdę.
     */
    @Test
    public void checkForThrees_oneThreeRow() {

        // given
        testClass = prepareTestClass();

        String row = "tyvctet";

        // when
        boolean result = testClass.checkForThrees(row);

        // then
        assertEquals(true, result);
    }

    /**
     * W danym wierszu mamy klika trójek liter
     * Powinniśmy otrzymać prawdę.
     */
    @Test
    public void checkForThrees_twoThreeRow() {

        // given
        testClass = prepareTestClass();

        String row = "tycvctcet";

        // when
        boolean result = testClass.checkForThrees(row);

        // then
        assertEquals(true, result);
    }

    /**
     * W danym wierszu mamy trójek i dwójkę liter
     * Powinniśmy otrzymać prawdę.
     */
    @Test
    public void checkForThrees_twoAndThreeInRow() {

        // given
        testClass = prepareTestClass();

        String row = "tycvtcet";

        // when
        boolean result = testClass.checkForThrees(row);

        // then
        assertEquals(true, result);
    }

    /**
     * W danym wierszu mamy dwójkę liter
     * Powinniśmy otrzymać fałsz.
     */
    @Test
    public void checkForThrees_twoInRow() {

        // given
        testClass = prepareTestClass();

        String row = "tycet";

        // when
        boolean result = testClass.checkForThrees(row);

        // then
        assertEquals(false, result);
    }

    /**
     * W danym wierszu nie mamy trójek ani dwójek liter
     * Powinniśmy otrzymać fałsz.
     */
    @Test
    public void checkForThrees_noTwosOrThreesInRow() {

        // given
        testClass = prepareTestClass();

        String row = "tycez";

        // when
        boolean result = testClass.checkForThrees(row);

        // then
        assertEquals(false, result);
    }
}
