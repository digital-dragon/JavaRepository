import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biConsumer = (i,s) -> {
            for(int j = 0; j < i; j++) {
                System.out.println(s);
            }
        };

        biConsumer.accept(3, "Hello World");

        biConsumer.andThen((k,str) -> {
            for(int j = 0; j < k; j++) {
                System.out.println(str.toUpperCase());
            }

        }).accept(2, "Hello BiConsumer");

    }
}
