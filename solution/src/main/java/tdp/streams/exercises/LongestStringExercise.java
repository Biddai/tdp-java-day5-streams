package tdp.streams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestStringExercise {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("Input: " + words);

        Optional<String> longest = findLongest(words);
        System.out.println("Longest: " + longest);
    }

    public static Optional<String> findLongest(List<String> words) {
        return words.stream()
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
    }
}
