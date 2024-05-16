package j_practice_basic;

public class Pratice_basic3 {

	public static void main(String[] args) {
		
		/*
		 	반복문을 이용하여 1~100까지의 정수 중 홀수의 합을 구하시오
		 */
		int hsum = 0;
		for(int i = 1; i<101 ;i++) {
			
			if(i % 2 == 1) {
				hsum += i;
			}// if 문
			
		}// for 문
		System.out.println("홀수의 합 : " + hsum);
		System.out.println("---------------------------------------");
		
		
		
		/*
		 	다음 사다리꼴 도형의 넓이를 구하여 출력하는 소스코드를 완성하세요.
		 	(단 소수점자리(실수)가 나와야함.)
   			(사다리꼴의 넓이) = ((윗변+아랫변) * 높이) / 2
		 */
		int top = 5;
		int bottom = 10;
		int highet = 7;
		String title = "사다리꼴의 넓이 = "; 
		double width = (double)((top+bottom)*highet)/2;
		System.out.printf("%s %.2f",title,width);
		System.out.println();
		System.out.println("---------------------------------------");
		
		
		
		/*
			문자열 형태로 사원명을 입력받아 변수에 저장하고 , 
			시급 과 근무 시간을 정수로 입력받아 아래와 같이 
			급여명세서가 출력 될 수 있도록 코드를 작성하시오. 
  			- 급여금액 : 시급 * 근무 시간
  			- 공제합계 : 급여금액의 3%
  			- 실지급액 : 급여금액 – 공제합계
  			- 정수로 계산
		 */
		
		

	}// end main
	
}// end class
