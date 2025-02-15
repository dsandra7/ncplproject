import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamExample {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to filter even numbers and square them
        List<Integer> squaredEvens = numbers.stream()
            .filter(n -> n % 2 == 0) // Filter even numbers
            .map(n -> n * n)         // Square each number
            .collect(Collectors.toList()); // Collect results into a list

        // Output the result
        System.out.println(squaredEvens); // Output: [4, 16, 36, 64, 100]
    }
}
