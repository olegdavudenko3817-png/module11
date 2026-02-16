package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListLines {

    public static List<String> process(List<String> list) {
        return list.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    static void main(String[] args) {
        List<String> listNames = Arrays.asList("Ivan", "Anna", "Peter", "Oleh", "Ihor");
        System.out.println(process(listNames));
    }
}
