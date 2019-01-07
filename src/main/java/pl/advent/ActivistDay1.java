package pl.advent;

/**
 * Interfejs do pierwszego dnia AdventIoCode.
 *
 * Przypadki testowe to będzie np.
 * dodanie wartości do sumy i odjęcie wartości od sumy
 * i może coś co będzie decydować, czy powinienem odjemować czy dodawać dany wiersz
 *
 * Przydadzą się metody do dodawania, odejmowania i decyzji
 *
 *
 *
 *
 * @author kmosiej
 * @since 2019-01-07
 */
public interface ActivistDay1 {

    /**
     * Dodaje podaną liczbę do wyniku
     *
     * @param result obecny wynik
     * @param number liczba do dodania
     * @return nowy wynik
     */
    long add(long result, long number);

    /**
     * Odejmuje podaną liczbę od wyniku
     *
     * @param result obecny wynik
     * @param number liczba do odjęcia
     * @return nowy wynik
     */
    long subtract(long result, long number);

    /**
     * Zwraca czy dany wiersz powinniśmy dodać czy odjąć od wyniku
     *
     * @param row wiersz z pliku z danymi
     * @return prawda, jeśli mamy dodać
     */
    boolean decideIfAdd(String row);
}
