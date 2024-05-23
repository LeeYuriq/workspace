package practice_01_03;

import java.util.Scanner;

public class Practice_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// sample id
		String myId = "id001";
		
		System.out.print("아이디 입력>");
		String id = sc.next();
		
		// if(myId == id)는 문자열이 같은지 비교하는것이 아니라 저장하고있는 주소값이 같은지 비교하고 있기 때문에 
		// 문자열이 같은지 비교할때는 equals를 사용한다. 
		// 문자열.equals(비교할 문자열)
		if(id.equals(myId)) {
			System.out.println("아이디가 일치합니다.");
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		sc.close();
	}
}
