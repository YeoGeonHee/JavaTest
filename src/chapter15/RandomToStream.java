package chapter15;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomToStream {
	public static void main(String[] args) {
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.println(s));
	}
}
