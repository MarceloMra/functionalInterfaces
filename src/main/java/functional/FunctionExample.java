package functional;

import interfaces.Example;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionExample implements Example {
    @Override
    public void example() {
        Function<Object, String> stringfyObject = o -> o.toString();
        System.out.println(
                stringfyObject.apply(
                        Arrays.asList("a", "b", "c")
                )
        );
    }
}
