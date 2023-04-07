package com.neuymin.tdd;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    // if number is divisible by 3 print Fizz
    // if number is divisible by 3 print Buzz
    // if number is divisible by 3 and 5 print FizzBuzz
    // if number is NOT divisible by 3 and 5 print the number

    @Test
    @Order(1)
    void testForDivisibleByThree() {

        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    @Order(2)
    void testForDivisibleByFive() {

        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive() {

        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @Test
    @Order(4)
    void testForNotDivisibleByThreeAndFive() {

        String expected = "1";
        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }

    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/small-test-data.csv")
    @Order(5)
    void testWithSmallDataFile(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/medium-test-data.csv")
    @Order(6)
    void testWithMediumDataFile(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/large-test-data.csv")
    @Order(7)
    void testWithLargeDataFile(int value, String expected) {

        assertEquals(expected, FizzBuzz.compute(value));
    }
}
