package pl.advent;

/**
 *
 * Potrzebne będą metody do określenia czy w danym wierszu jest para albo trójka liter
 *
 *
 *
 *
 * @author kmosiej
 * @since 2019-01-08
 */
public interface ActivistDay2 {

    /**
     * Sprawdza czy w danym wierszu jest para liter
     * @param row wiersz
     * @return prawda, jeżeli jest conajmniej jedna para liter
     */
    boolean checkForTwos(String row);

    /**
     * Sprawdza czy w danym wierszu jest trójka liter
     * @param row wiersz
     * @return prawda jeżeli jest conajmniej jedna trójka liter
     */
    boolean checkForThrees(String row);

}
