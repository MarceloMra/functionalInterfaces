package functional;

import interfaces.Example;

import java.util.function.Consumer;

public class ConsumerExample implements Example {
    @Override
    public void example() {

        Consumer<String> namer = System.out::println;
        namer.accept("Marcelo");

    }
}
