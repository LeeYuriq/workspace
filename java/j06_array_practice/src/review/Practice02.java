package review;

import java.util.Scanner;

/**
 * 총 5개의 정수를 저장할 수 있는 배열을 생성 하고 사용자로부터 정수를 입력받아 배열에 저장하고, 
 * 저장된 값들을 출력하는 소스코드를 작성하세요.
 */
public class Practice02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 코드 작성
		int [] array1 = new int[5] ;
		
		System.out.println("첫번째 정수를 입력하세요 > ");
		int input1 = scanner.nextInt();
		array1[0] = input1;
		
		System.out.println("두번째 정수를 입력하세요 > ");
		int input2 = scanner.nextInt();
		array1[1] = input2;
		
		System.out.println("세번째 정수를 입력하세요 > ");
		int input3 = scanner.nextInt();
		array1[2] = input3;
		
		System.out.println("네번째 정수를 입력하세요 > ");
		int input4 = scanner.nextInt();
		array1[3] = input4;
		
		System.out.println("다섯번째 정수를 입력하세요 > ");
		int input5 = scanner.nextInt();
		array1[4] = input5;
		
		for(int i = 0;i < array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		
		
		

	} // end main
} // end class
