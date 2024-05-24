package practice_01_03;

import java.util.Scanner;

public class Practice_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// sample id
		//스트링이라는 문자열은 리터럴은 상수풀에 저장된다.
		//new로 생성됐을때와는 위치가 다르다
		String myId = "id001";
		System.out.println(myId.toString());
		System.out.println(myId);
		//객체가 저장되어 있는 메모리 주소를 10진법의 int type의 정수로 반환
		//null은 0을 반환
		int address = System.identityHashCode(myId);
		System.out.println("myId address : " + address);
		
		String tempId = "id001";
		address = System.identityHashCode(tempId);
		System.out.println("tempId address : " + address);
		// 주소값 같아서 true라고 뜬다.
		System.out.println(myId == tempId);
		
		String userId = new String("id001");
		address = System.identityHashCode(userId);
		System.out.println("userId address : "+ address);
		//서로 저장된 위치가 다르니까 false라고 뜬다.
		System.out.println(userId == myId);
		
		System.out.print("아이디 입력>");
		String id = sc.next();
		address = System.identityHashCode(id);
		System.out.println("id address : "+address);
		
		// if(myId == id)는 문자열이 같은지 비교하는것이 아니라 저장하고있는 주소값이 같은지 비교하고 있기 때문에 
		// 문자열이 같은지 비교할때는 equals를 사용한다. 
		// 문자열.equals(비교할 문자열)
		// Api class
		if(id.equals(myId)) {
			System.out.println("아이디가 일치합니다.");
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		sc.close();
	}
}
