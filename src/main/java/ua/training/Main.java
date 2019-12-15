package ua.training;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 0, 7, -1, 8, 9, 10, 0};

        double averageValue = IntStream.of(array)
                .average()
                .orElse(0);

    }

}
