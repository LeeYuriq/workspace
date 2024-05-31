package student_test_0531;

import java.util.Scanner;

public class test0531_2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // import
		
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("문자열을 입력해 주세요>>");
			String input = sc.nextLine();
			int inputR = input.indexOf("java");
			if(inputR == -1) {
				System.out.println("java가 존재하지않습니다.");
				continue;
			}else{
				System.out.println("java가 존재합니다.");
				System.err.println("시스템을 종료합니다.");
				isRun = false;
			}// end if
			
		}// end while
		
	}// end main method

}// end test0531_2_1 class
