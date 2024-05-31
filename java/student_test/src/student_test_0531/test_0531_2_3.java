package student_test_0531;

import java.util.Arrays;

public class test_0531_2_3 {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };
		
		int[] mergedArray = null;
		
		// 코드 작성

		mergedArray = Arrays.copyOf(array1,array1.length + 5);
		System.arraycopy(array2, 0 , mergedArray, 5 , array2.length);

		
		System.out.print("array1 : ");
		System.out.println(Arrays.toString(array1));
		System.out.print("array2 : ");
		System.out.println(Arrays.toString(array2));
		System.out.print("병합된 배열 : ");
		System.out.println(Arrays.toString(mergedArray));
		
	}// end main method
	
}// end test_0531_2_3 class
