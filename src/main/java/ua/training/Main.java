package ua.training;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 0, 7, -1, 8, 9, 10, 0};

        IntStream.of(array)
                .average()
                .ifPresent(avg -> println("Average value (via average): " + avg));

        println("Average value (without average): "
                + (double) IntStream.of(array).sum() / array.length);

        IntStream.range(0, array.length)
                .reduce((i, j) -> array[i] > array[j] ? j : i)
                .ifPresent(i -> println("Min element: index = " + i
                        + ", value = " + array[i]));

        println("Number of zeros: " + IntStream.of(array)
                .filter(x -> x == 0)
                .count()
        );

        println("Number of positive numbers: " + IntStream.of(array)
                .filter(x -> x > 0)
                .count()
        );

        println("Array multiplied by 10: ");
        IntStream.of(array)
                .map(x -> x * 10)
                .forEach(Main::println);
    }

    private static void println(int value) {
        System.out.println(value);
    }

    private static void println(String value) {
        System.out.println(value);
    }

}
