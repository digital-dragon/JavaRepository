import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, List<String>> listGeneratiorFunction = (i) -> {
            var list = new ArrayList<String>();

            for (int j = 0; j < i; j++) {
                list.add("Hello Function");
            }
            return list;
        };

        Function<Integer, List<String>> listGeneratiorFunctionTwo = (i) -> {
            var list = new ArrayList<String>();

            for (int j = 0; j < i; j++) {
                list.add("Hello Compose");
            }
            return list;
        };

        Function<List<String>, List<String>> listMapperFunction = lst -> lst.stream().map(String::toUpperCase).toList();

        System.out.println("Function apply demo");
        listGeneratiorFunction.apply(3).forEach(System.out::println);

        System.out.println("Function andThen demo");
        listGeneratiorFunction.andThen(lst -> lst.stream().map(String::toUpperCase).toList()).apply(2).forEach(System.out::println);

        System.out.println("Function compose demo");
        listMapperFunction.compose(listGeneratiorFunctionTwo).apply(2).forEach(System.out::println);

        System.out.println("Function identity demo");
        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Hello identity"));
    }
}
