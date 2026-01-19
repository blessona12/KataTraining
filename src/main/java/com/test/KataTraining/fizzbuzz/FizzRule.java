package com.test.KataTraining.fizzbuzz;

public class FizzRule implements Rule{

    @Override
    public boolean matches(int number) {
        return number % 3 == 0;
    }

    @Override
    public String apply() {
        return "Fizz";
    }
}
