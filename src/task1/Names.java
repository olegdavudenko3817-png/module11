package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names {
    public static String formatName(List<String> names) {
        return IntStream.range(0,names.size()).filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " +names.get(i))
                .collect(Collectors.joining(", "));

    }

    static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Anna", "Peter", "Oleh", "Ihor");
        System.out.println(formatName(names));
    }
}
