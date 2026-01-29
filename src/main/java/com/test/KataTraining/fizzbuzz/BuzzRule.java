package com.test.KataTraining.fizzbuzz;

public class BuzzRule implements Rule{

    @Override
    public boolean matches(int number) {
        return number % 5 == 0;
    }

    @Override
    public String apply() {
        return "Buzz";
    }
}
