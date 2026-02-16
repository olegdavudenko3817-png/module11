package task4;

import java.util.stream.Stream;

public class RandomNumbers {

    public static Stream<Long> log(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x +c) % m);
    }

    static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = 1L << 48;
        long seed = 1;

        log(a, c, m, seed).limit(10).forEach(System.out::println);
    }
}
