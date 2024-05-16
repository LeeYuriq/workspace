
public class Practice03ControlExample {

	public static void main (String[] args) {
		// 반복문을 이용하여 1~100까지의 정수 중 홀수의 합을 구하시오
		
		// 홀수 총 합계를 저장할 변수
		
		int odd = 0 ;
		
		for(int i =1; i <= 100; i +=2) {
			odd = odd + i;
		}
		System.out.println("홀수의 총합 : " + odd);
		
		// 1~ 100까지 홀수의 총합, 짝수의 총합, 전체 종합을 구하시오.
		int even, sum ;
		odd = even = sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i; //전체합계
			if(i % 2 == 0) {
				// 2로 나누어 떨어지는 2의 배수 또는 짝수 
				even += i;
			}else {
				//나머지가 1인 홀수 
				odd += i;
			}
		}// end for
		System.out.println("홀수 합계 : " + odd);
		System.out.println("짝수 합계 : " + even);
		System.out.println("전체 합계 : " + sum);
		
		System.out.println("----------------------------------");
		
		
		/*
		 * 다음 사다리꼴 도형의 넓이를 구하여 출력하는 소스코드를 완성하세요.
		 * (단 소수점자리(실수)가 나와야함.)
   			(사다리꼴의 넓이) = ((윗변+아랫변) * 높이) / 2
		 */
		
		int top = 5;		//윗변
		int bottom = 10;	//아랫변
		int height = 7;		//높이
		double area = (double)((top+bottom) * height) / 2;
		System.out.println("사다리꼴의 넓이는 : " + area);
		
	}// end main
}//end class
