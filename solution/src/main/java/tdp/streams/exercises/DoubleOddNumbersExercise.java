package tdp.streams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleOddNumbersExercise {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Input: " + numbers);

        List<Integer> result = doubleOddNumbers(numbers);
        System.out.println("Result: " + result);
    }

    public static List<Integer> doubleOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
