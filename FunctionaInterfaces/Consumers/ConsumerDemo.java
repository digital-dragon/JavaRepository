import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> consumer = (s) -> System.out.println(s);

        consumer.accept("Hello World!");

        consumer.andThen(s -> System.out.println(s.toUpperCase())).accept("Hello Consumer");

    }
}
