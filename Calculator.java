package ru.netology;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator {

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
   // BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;   //деление на ноль

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abc = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    public void calculator(){
    }

    @FunctionalInterface
    public interface Supplier<T> {
    T get();
    }

    public static Supplier<Calculator> instance = Calculator::new;

}
