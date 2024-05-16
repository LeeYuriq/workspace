package review;

/**
 * numbers 배열에 나열된 각 항목의 값을 오름차순으로 정렬하여 저장하고
 * 저장된 배열의 값을 출력하시오.
 */
public class Practice04 {
	
	public static void main(String[] args) {
		
		int[] numbers = { 25, 13, 45, 67, 33, 92, 17 };
		
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {

				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		} // end sorting
		
		// 정렬 확인
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
		
		
	} // end main

} // end class
