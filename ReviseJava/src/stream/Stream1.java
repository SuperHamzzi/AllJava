package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Stream1 {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5);
	Stream<Integer> intStream = list.stream(); // list 를 스트림으로 변환
	intStream.forEach(System.out::print);
//	intStream.forEach(System.out::print); // Stream은 일회용
	
	intStream = list.stream(); //list로 부터 Stream을 재생성
	intStream.forEach(System.out::print);
	System.out.println();
	
	int[] intArr = {1,2,3,4,5};
	IntStream intStream2 = Arrays.stream(intArr);
	intStream2.forEach(System.out::println);
}
}
