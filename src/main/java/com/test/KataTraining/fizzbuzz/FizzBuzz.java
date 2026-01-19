package com.test.KataTraining.fizzbuzz;

import java.util.List;

public class FizzBuzz
{
 private final List<Rule> rules = List.of(new FizzRule(),new BuzzRule());

public String convert(int number) {
    String result = "";
    for (Rule rule : rules)
        if (rule.matches(number)) {
            result+= rule.apply();
        }

    return result.isEmpty() ? String.valueOf(number): result;
}
}
