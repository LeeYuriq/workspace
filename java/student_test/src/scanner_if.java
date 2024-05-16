import java.util.Scanner;

public class scanner_if {

	public static void main (String[] args) {
		
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		
		if(a1 > 0) {
			System.out.println("입력한 수는 양수입니다.");		
		}else if(a1 < 0) {
			System.out.println("입력한 수는 음수입니다.");
		}else {
			System.out.println("입력한 수는 0입니다.");
		}//end if
		
	}// end main
	
}// end class
