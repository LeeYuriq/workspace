package exception_01_try_catch;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {

		System.out.println("Main START");
		
		// 4개의 정수값을 저장할 배열 생성
		int[] scores = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				
			System.out.println("배열에 삽입하려는 인덱스 번호를 입력 > ");
			int index = sc.nextInt();
			System.out.println("점수를 입력하세요 > ");
			int score = sc.nextInt();
			scores[index] = score;
			
			System.out.println("입력하려는 점수를 한번 더 입력해주세요.");
			String num = sc.next();
			
			int number = Integer.parseInt(num);	// "삼"
			
			// 한번 더 입력받아 일치하는 값일 떄 배열에 값 추가
			if(score == number) {
				scores[index] = score;
			}else {
				System.out.println("일치하지 않습니다.");
				scores[index] = 0;
			}
			
			// 사용할 수 없는 인덱스 번호(음수) 일 경우 while 문 종료
			if(index < 0) break;
			
			// 예외처리 1
			// 배열에 사용할 수 있는 인덱스 번호를 벗어남
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열에 사용할 수 없는 인덱스 번호 입니다.");
				System.out.println("다시 입력해 주세요.");
				continue; // while 문으로 돌아가기
			// 예외처리 2
			// 입력타입이 맞지 않을 때
			}catch(InputMismatchException | NumberFormatException e){	// java.util package import 추가
				System.out.println("정수가 입력되지 않았습니다");
				System.out.println("숫자로 입력해 주세요.");
				sc.next();	// 정수가 아닌 사용되지 못한 입력값을 제거
				continue; // while 문으로 돌아가기
			}catch(Exception e){
				// 발생된 예외에 대한 정보를 console에 출력
				// e.printStackTrace(); 
				break; // while 종료
			// Exception 최상위 객체가 다 실행해서 하위 Exception 객체는 실행할 수 없다 
			// }catch(NumberFormatException e){	
				
			// 정상/예외 항상 실행됨
			}finally{
				System.out.println(Arrays.toString(scores));
				System.out.println("항상 실행");
			}// end try
			
		}// end while
		
		// scores 배열에 저장된 항목 값 출력
		System.out.println(Arrays.toString(scores));
		// 빨간줄 뜨는 이유는 while 문이 안끝났기 때문에 끝날 수 있게 해준다.
		System.out.println("Main END");
		
	}// end main method

}// end TryCatchExample class
