package com.test.KataTraining.fizzbuzz;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FizzbuzzTest {

    @Test
    void matchesVisibleWhenDivisibleByThree()
    {
        Rule rule=new FizzRule();
        assertTrue(rule.matches(3));
        assertFalse(rule.matches(5));
    }

    @Test
    void returnsNumberWhenNotDivisible()
    {
        FizzBuzz f=new FizzBuzz();
        assertEquals("1",f.convert(1));
    }

    @Test
    void returnsFizzifnodividivisiblebyThree()
    {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void returnsBuzzifNumberDivisibleByFive()
    {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.convert(10));
    }

    @Test
    void returnsFizzBuzzIfNumberDivisibleByThreeAndFive()
    {
        FizzBuzz fizzBuzz= new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.convert(15));
    }
}
