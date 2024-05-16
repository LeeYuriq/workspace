import java.util.Scanner;

public class scanner_while_if {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int su = sc.nextInt();
			
			int sum = 0;
			int tsum = 0;
				
			for(int i = 1; i <= su ;i++) {
				if(i >= 1) {
					sum += i;
				}//if문
				if(i % 3 == 0) {
					tsum += i;		
				}//if문
							
			}//for문
				
			System.out.println("1부터 "+su+"까지의 총합계 : "+sum);
			System.out.println("1부터 "+su+"까지의 3의 배수의 총합계 : "+tsum);

		}// while문
		
	}// end main
	
}// end class
