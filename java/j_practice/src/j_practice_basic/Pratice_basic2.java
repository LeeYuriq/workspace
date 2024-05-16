package j_practice_basic;

public class Pratice_basic2 {

	public static void main(String[] args) {
		
		/*
		 반복문을 이용하여 1~10까지의 합을 구해서 
		 더해진 수와 전체 합계를 출력하는 코드를 작성하시오.(print, println)
		 */
		System.out.println(" - 결과 ");
		int i = 1;
		int sum = 0;
		int dd = 0 ;

		for(;;i++) {
			

			if(i >= 11) {
			
				break;
			}
			sum += i ;
			
			dd = i;
			System.out.print(dd + " ");
			
		}
		System.out.println();
		System.out.println("합 : " + sum);
		
	}// end main
	
}// end class
