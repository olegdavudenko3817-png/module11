package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysSort {

    public static String sortNumbers(String[] arr) {
        return Arrays.stream(arr).flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt).sorted().map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        System.out.println(sortNumbers(arr));
    }
}
