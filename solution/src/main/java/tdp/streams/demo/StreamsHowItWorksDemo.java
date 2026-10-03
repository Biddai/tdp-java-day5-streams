package tdp.streams.demo;

import java.util.Arrays;
import java.util.List;

public class StreamsHowItWorksDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Input: " + numbers);

        numbers.stream()
                .map(x -> x * x)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
