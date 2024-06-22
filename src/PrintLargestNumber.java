import java.util.Arrays;
import java.util.List;

/*
* Given an array of numbers, arrange them in a way that yields the largest value.
* For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654
* gives the largest value. And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4},
* then the arrangement 998764543431 gives the largest value.
* */
public class PrintLargestNumber {
    public static void main(String...args) {
        List<String> numbers = Arrays.asList("54", "546", "548", "60");
        printLargestNumber(numbers);

    }

    private static void printLargestNumber(List<String> numbers) {
        numbers.sort((a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });
        numbers.forEach(System.out::print);
    }
}
