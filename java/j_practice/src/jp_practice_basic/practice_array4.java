package jp_practice_basic;

import java.util.Scanner;

public class practice_array4 {

	public static void main (String[] args) {
		
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("------------------------------------");
			for(int i = 0; i < size; i++)
				System.out.print(i+1 + " ");
			System.out.println("\n-----------------------------------");
			for(int i = 0; i < size; i++)
				System.out.print(seats[i] + " ");
			System.out.println("\n-----------------------------------");
			
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt(); //좌석입력
			
			
			if(s == -1) {
				System.out.println("종료합니다");
				break;
			}else {
				seats[s] = 1;
				System.out.println("예약되었습니다.");
				continue;
			}
			
			
		}// while
		
		
	}// end main
	
}// end class
