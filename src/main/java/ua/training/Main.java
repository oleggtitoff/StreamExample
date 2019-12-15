package ua.training;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 0, 7, -1, 8, 9, 10, 0};

        double averageValue = IntStream.of(array)
                .average()
                .orElse(0);

        int minElementValue = IntStream.of(array)
                .min()
                .orElse(0);

        int minElementIndex = IntStream.range(0,array.length)
                .reduce((i,j) -> array[i] > array[j] ? j : i)
                .orElse(0);

        long numberOfZeroElements = IntStream.of(array)
                .filter(x -> x == 0)
                .count();

        long numberOfPositiveNumbers = IntStream.of(array)
                .filter(x -> x > 0)
                .count();

    }

}
