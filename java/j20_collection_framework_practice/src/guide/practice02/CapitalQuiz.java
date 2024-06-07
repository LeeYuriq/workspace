package guide.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapitalQuiz {
	
	private List<Nation> store = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * 객체 생성시 store ArrayList에 8개의 국가에 대한 기본적인 정보 입력 
	 */
	public CapitalQuiz() {
		
	}
	
	/**
	 * 수도 맞추기 게임 시작
	 */
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.println("입력 : 1, 퀴즈 : 2, 종료 : 3");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					// 국가별 수도 정보 추가
					input();
					break;
				case 2 : 
					// 국가 이름으로 수도 정보 맞추기
					quiz();
					break;
				case 3 : 
					System.out.println("게임을 종료합니다.");
					return;
				default :
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	/**
	 * 국가 등록 - 국가 이름, 수도 이름 Nation 정보 등록 
	 */
	private void input() {
		System.out.printf("현재 %d개 나라와 수도가 입력되어 있습니다.", (int)store.size());
		System.out.println();
		
		/*
		while() {
			System.out.printf("국가 입력(현재:%d번째 국가 등록 / q는 종료)>>", (int)store.size()+1);
			System.out.println();
			String ct = sc.next();
			String cp = sc.next();
		}
		*/
		

	}// end input method
	
	
	/**
	 * 국가 별 수도 이름 맞추기 게임 
	 */
	private void quiz() {
		
	}//end quiz method

	
	public static void main(String[] args) {
		CapitalQuiz quize = new CapitalQuiz();
		quize.run();
	}//end main method

	
}// end CapitalQuiz class





