package api_practice;

import java.util.Arrays;
import java.util.Random;

/**
	1. 1~100까지의 난수를 발생해 int형 배열에 10개의 값을 담고 
	아래와 같이 출력 후 오름차순으로 정렬해서 출력 될 수 있도록 코드를 작성하시오.
	(Random class 와 Arrays class 사용)
*/
public class Practice01ArraysRandomExample {

	public static void main(String[] args) {
		
		int[] arrays = new int[10];	// 10개의 정수값을 저장할 배열
		
		Random random = new Random();
		
		for(int i = 0; i < arrays.length; i++ ) {
			int result = random.nextInt(100) + 1;
			arrays[i] = result;
		}// end for 
		
		System.out.print("최초의 리스트 : ");
		System.out.println(Arrays.toString(arrays));
		
		Arrays.sort(arrays);
		System.out.print("정렬된 리스트 : ");
		System.out.println(Arrays.toString(arrays));
		
	}// end main method

}// end Practice01ArraysRandomExample class










