package chapter15;

import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		
		Stream stream = Stream.builder()
				.add("무궁화")
				.add("삼천리")
				.add("화려강산")
				.add("대한사람")
				.build();
		stream.forEach(s -> System.out.println(s+" "));
	}

}
