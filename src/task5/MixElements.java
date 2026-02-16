package task5;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MixElements {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.toList();
        List<T> list2 = second.toList();

        int minSize = Math.min(list1.size(), list2.size());

        return IntStream.range(0, minSize * 2)
                .mapToObj(i -> i % 2 == 0 ? list1.get(i / 2) : list2.get(i / 2));
    }

    static void main(String[] args) {
        Stream<String> s1 = Stream.of("A", "B", "C","D");
        Stream<String> s2 = Stream.of("1", "2", "3");

        zip(s1, s2).forEach(System.out::println);

    }
}
