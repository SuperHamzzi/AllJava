 package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
////		IntStream intStream = new Random().ints(); // 무한 스트림 계속 나옴
//		IntStream intStream = new Random().ints(10,5, 10); // 무한 스트림 계속 나옴	
//		intStream.forEach(System.out::println); //limit 값으로 잘라서 출력해야함
		
		
		
		Stream<Integer> intStream = Stream.iterate(0, n -> n+2);
		intStream.limit(5).forEach(System.out::println);
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(5).forEach(System.out::println);
	}

}
