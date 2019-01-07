package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import pl.advent.Day1;

/**
 * pl.advent.Day1 Tester.
 */
public class Day1Test {

    private Day1 testClass;

    @Before
    public void before() throws Exception {

        testClass = new Day1();
    }

    @Test
    public void testAdd() throws Exception {

        long result = 3;
        long numberToAdd = 5;

        assertEquals(result + numberToAdd, testClass.add(result, numberToAdd));
    }

    @Test
    public void testSubtract() throws Exception {

        long result = 10;
        long numberToSubtract = 5;

        assertEquals(result - numberToSubtract, testClass.subtract(result, numberToSubtract));
    }

    @Test
    public void testDecideIfAddExpectedToAdd() throws Exception {

        String rowToAdd = "+3";

        assertEquals(true, testClass.decideIfAdd(rowToAdd));
    }

    @Test
    public void testDecideIfAddExpectedToSubtract() throws Exception {

        String rowToSubtract = "-1";

        assertEquals(false, testClass.decideIfAdd(rowToSubtract));
    }
} 
