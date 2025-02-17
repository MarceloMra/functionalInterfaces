package functional;

import interfaces.Example;

import java.util.function.Predicate;

public class PredicateExample implements Example {
    @Override
    public void example() {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(3));
    }
}
