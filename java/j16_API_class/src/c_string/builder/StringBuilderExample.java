package c_string.builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String a = "최기근";
		String b = "최기근";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		a += "바보";
		System.out.println(a.hashCode());
		a = a + "래요 ";
		System.out.println(a.hashCode());
		
		//따로 import하지 않아도 되는건 java.lang에 있기 때문
		StringBuilder sb = new StringBuilder("초기값  : ");
		sb.append("자바 ");
		sb.append("Programming Study!! ");
		sb.append(1.8);
		String result = sb.toString();
		System.out.println(result);
		
		System.out.println(sb.hashCode());
		// 저장된 문자열에서 4번째 인덱스에 2번째 매개변수 값을 삽입.
		sb.insert(4, 2);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		//해당 인덱스에 있는 문자를 두번쨰 매개변수 문자로 변경
		sb.setCharAt(4, '8');
		//초기값 2 : 자바 Programming Study!! 1.8
		System.out.println(sb);
		
		// delete(시작인덱스, 해당자리까지) 문자열 삭제
		sb.delete(4,6);
		//초기값 8 : 자바 Programming Study!! 1.8
		System.out.println(sb);
		
		//지정한 인덱스의 문자 삭제
		// 초기값   자바 Programming Study!! 1.8
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		// 역으로 문자열 정렬
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
		// 8.1 !!ydutS gnimmargorP 바자  값기초
		System.out.println(reverse.hashCode());
		
		
	}// end main method

}// end StringBuilderExample class
