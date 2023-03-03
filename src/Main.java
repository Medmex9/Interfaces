import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static javax.swing.text.html.HTML.Tag.U;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Написать Predicate, который проверяет, является ли число положительным. То есть, если число
        // положительное, то предикат должен возвращать true, в противном случае false.
        // Реализовать Predicate в двух вариантах:через анонимный класс, через лямбду

        Predicate<Integer> num = integer -> integer > 0;
        System.out.println(num.test(1));
        System.out.println(num.test(0));
        System.out.println(num.test(-1));
        Predicate<Integer> num1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(num1.test(1));
        System.out.println(num1.test(0));
        System.out.println(num1.test(-1));


// Создать Consumer, который будет принимать на вход имя человека и выводить в консоль его приветствие.
//Реализовать Consumer в двух вариантах: через анонимный класс< >через лямбду

        Consumer<String> name = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет" + s);
            }
        };
        name.accept("Саша");
        Consumer<String> name1 = p -> System.out.println("Привет" + p);
        name1.accept("Петя");

        // Реализовать функциональный интерфейс Function, который принимает
        // на вход вещественное число типа Double, а возвращает его округленный вариант типа Long.

        Function<Double, Long> num2 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(num2.apply(23432.232));
        Function<Double, Long> num3 = y-> Math.round(y);
        System.out.println(num3.apply(3212.2322));


        // Написать Supplier, который будет возвращать случайное число от 0 до 100.
        Supplier<Integer> num4 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(num4.get());
        Supplier<Integer> num5 = ()-> (int)(Math.random() * 100);
        System.out.println(num5.get());

        // Задание 5 не уверен в его корректности, но в вопросах ответах к ДЗ вроде так сделано.
        public static<T, U > Function <T,U> ternaryOperator{
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
                return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

        }
    }
}
}