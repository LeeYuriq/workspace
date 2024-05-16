package jp_practice_basic;

public class practice_array1 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 50 ,3, 60, -3};
		
		//arr 배열 중에서 값이 60인 곳의 인덱스 번호를 출력하는 소스코드를 작성하시오.
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 60) {
				continue;
			}else {
				System.out.println(i);
			}//if문
		}//for문
		
		
		System.out.println("=======================================");
		//arr 배열의 인덱스 번호가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 3) {
				System.out.println(arr[i]+" ");
			}else{
				continue;
			}//end if
		}//end for
	
		
	}// end main
	
}// end class
