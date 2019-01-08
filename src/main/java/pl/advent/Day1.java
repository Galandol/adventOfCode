package pl.advent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public List<String> prepareInputList() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Scanner s = new Scanner(new File("C:\\Users\\kmosiej\\Desktop\\adventOfCode\\src\\main\\java\\pl\\advent\\input.txt"));
            while (s.hasNext()) {
                list.add(s.next());
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean checkIfDuplicate(List<Long> resultsList, long newResult) {
        return resultsList.contains(newResult);
    }
}
