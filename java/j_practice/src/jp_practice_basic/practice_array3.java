package jp_practice_basic;

import java.util.Scanner;

public class practice_array3 {

public static void main (String[] args) {
		
		int[] arr = {10, 20, 30, 50 ,3, 60, -3};
		Scanner sc = new Scanner(System.in);
		
		for(int array1 : arr) {
			System.out.print(array1+" ");
			}//for 배열항목 순회
			System.out.println();
		
		
		System.out.print("인덱스 번호1 ( 0 ~ 6 까지)> ");
		int num1 = sc.nextInt();
		System.out.print("인덱스 번호2 ( 0 ~ 6 까지)> ");
		int num2 = sc.nextInt();
		
		int temp = 0;
		
		temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
		
		for(int array1 : arr) {
			System.out.print(array1+" ");
			}//for 배열항목 순회
			System.out.println();
		
		
	}// end main

}//end class
