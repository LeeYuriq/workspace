package practice;

import java.util.Scanner;

public class TheaterReserve {
	

	public static void main (String[] args) {
		/*
		
		Scanner sc = new Scanner(System.in);
		//final - 한번 값이 초기화 되면 값을 변경 할 수 없는 변수
		final int size = 10;
		// size = 100; //final 변수는 값의 재할당 불가
		// 예약 좌석 정보를 저장할 배열
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("------------------------------------");
			//좌석을 입력하기 위한 좌석 번호를 출력
			for(int i = 0; i < seats.length; i++)
				System.out.print((i+1) + " ");
			}
			System.out.println();
			System.out.println("------------------------------------");
			
			//배열의 각 항목에 저장된 값을 이용하여
			//예약가능, 예약완료 여부를 출력, 예약가능 : 0, 예약완료 : 1
			
			for(int i : seats) {
				System.out.print(i + " "); //한 라인에 값 출력
			}
			System.out.println();
			System.out.println("------------------------------------");
			
			//예약 좌석 번호 입력받기
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			//사용자가 입력한 좌석 번호를 seat변수에 저장
			int seat = sc.nextInt();
			
			//-1이 입력되면 프로그램 종료
			if(seat == -1) {
				System.out.println("프로그램 종료");
				//인접한 반목문을 즉시 탈출
				break;
			}
			//입력받은 좌석 번호로 예약 등록
			//입력한 좌석 번호가 예약할 수 있는 자리 인지 확인.
			//좌석 번호는 1 ~ 10
			if(seat < 1 || seat > 10) {
				System.out.println("선택할 수 없는 자리 입니다.");
				continue;
				//continue; 아래쪽 작업은 수행하지 않고 반복문으로 복귀 
			}
			//예약이 완료된 자리는 예약 할 수 없음, 중복 예약 제거
			// 좌석번호 : 1 ~ 10, 배열 인덱스 번호 : 0 ~ 9 
			if(seats[seat - 1] == 0) {
				//해당 좌석번호의 인덱스 위치를 1로 변경하여 예약완료 자리 표현
				seats[seat - 1] = 1;
				System.out.println("예약이 완료되었습니다.");
			}else {
				System.out.println("이미 예약이 완료된 자리입니다.");
			}
			
			
			
		}//while
		
		*/
		


		
		
	}//end main
	
}// end class