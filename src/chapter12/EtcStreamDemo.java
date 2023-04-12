package chapter12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EtcStreamDemo {
  public static void main(String[] args) {
    IntStream ints = new Random().ints(0, 10);
    IntStream iterate = IntStream.iterate(0, i -> i + 1);
    Stream<Double> generate = Stream.generate(Math::random);
    IntStream.range(1, 5);
  }
}
