package functional;

import interfaces.Example;

import java.util.function.Supplier;

public class SuplierExample implements Example {
    @Override
    public void example() {
        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());
    }
}
