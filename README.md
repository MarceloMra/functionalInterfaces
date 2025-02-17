# Java Functional Interfaces

Java provides several built-in functional interfaces in the `java.util.function` package that facilitate functional programming. Below is a summary of the main functional interfaces: `Consumer`, `Function`, `Predicate`, and `Supplier`.

## Functional Interfaces Comparison

| Functional Interface | Input Type | Output Type | Purpose |
|----------------------|------------|------------|---------|
| `Consumer<T>`       | ✅ Yes (T) | ❌ No       | Performs an operation on a given input without returning a result (e.g., logging, modifying an object). |
| `Function<T, R>`    | ✅ Yes (T) | ✅ Yes (R)  | Transforms an input into an output (e.g., mapping, converting types). |
| `Predicate<T>`      | ✅ Yes (T) | ✅ Yes (Boolean) | Tests a condition and returns `true` or `false` (e.g., filtering, validation). |
| `Supplier<T>`       | ❌ No      | ✅ Yes (T)  | Supplies a value without taking any input (e.g., generating objects, fetching data). |

## Code Examples

### 1. Consumer Example
```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, World!");
    }
}
```

### 2. Function Example
```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> numberToString = num -> "Number: " + num;
        System.out.println(numberToString.apply(10));
    }
}
```

### 3. Predicate Example
```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false
    }
}
```

### 4. Supplier Example
```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
```

## Conclusion
These functional interfaces allow for a more declarative and concise approach to handling operations in Java, particularly useful in lambda expressions and stream processing.

