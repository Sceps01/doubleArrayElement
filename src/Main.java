import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,20,40,50,60);

        arr.stream().mapToInt(n -> n * 2).forEach(System.out::println);
        System.out.println();
        arr.stream().mapToInt(n -> n * 2).filter(n -> n >= 100).forEach(System.out::println);
        OptionalDouble average = arr.stream().mapToInt(n -> n * 2).filter(n -> n >= 100).average();
        System.out.println("average: " + average.getAsDouble());
    }
}