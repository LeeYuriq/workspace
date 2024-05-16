package j_practice_basic;

import java.util.Scanner;

public class Pratice_basic1 {

	public static void main(String[] args) {
		/*
		문자열을 저장하는 변수 str을 선언과 동시에 “HELLO JAVA”값으로 초기화 하고
		아래와 같이 변수 str의 값을 출력하는 코드를 작성하시오.
		*/
		String str = "HELLO JAVA";
		System.out.println(str);
		System.out.println("-----------------------------");
		
		
		
		/*
		- 실수를 저장하는 radius 변수선언 (반지름)
    	- 실수를 저장하는 area 변수 선언 (원의면적)
    	- 사용자에게 실수를 입력 받는다 – 값을 받아서 radius 에 대입(Scanner 이용)
    	- area 변수에 사용자에게 입력받은 radius를 이용하여 원의 면적을 구하여 값을 대입
    	- area 값을 출력한다. (원의 면적 : 반지름 * 반지름 * 원주율(3.14))
		 */
		double radius ;
		double area ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력하시오 : ");
		radius = scanner.nextDouble();
		area = radius * radius * 3.14;
		System.out.println(area);

		
	}// end main
	
}// end class
