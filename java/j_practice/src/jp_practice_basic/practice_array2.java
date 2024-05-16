package jp_practice_basic;

import java.util.Scanner;

public class practice_array2 {

	public static void main (String[] args) {
		
		int[] arr = {10, 20, 30, 50 ,3, 60, -3};
		
		Scanner sc = new Scanner(System.in);
		
	/*
	  	arr 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 
		그 값을 1000으로 변경해보자.
		예) 입력받은 인덱스 번호 : 3
    	{10, 20, 30, 1000, 3, 60, -3}
	*/
		
	for(int array1 : arr) {
	System.out.print(array1+" ");
	}//for 배열항목 순회
	System.out.println();
	
	System.out.print("인덱스 번호를 입력하세요 > ");
	int num = sc.nextInt();
	arr[num] = 1000;
	

	for(int array1 : arr) {
		System.out.print(array1+" ");
	}//for 배열항목 순회
	System.out.println();
	
	System.out.println("==============================================");
	
	//승진이 코드 + 살짝 수정
	System.out.print("인덱스 번호를 입력하세요2 > ");
    int number = sc.nextInt();
    arr[number] = 1000 ;
    for(int i : arr) {
 	   System.out.print(i+" ");
   }
	
	
	
	
   
	
		
	}// end main
	
}// end class
