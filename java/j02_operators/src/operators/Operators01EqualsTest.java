package operators;

/**
 * 20240425-03
 * 비교연산자 실습
 */

public class Operators01EqualsTest {

	public static void main(String[] args) {
		/*
		  	크기 비교 연산자
		  	>, >=, <, <=
		  	
		  	동등 비교 연산자
		  	==, !=
		  	
		  	논리 비교 연산자
		  	&&, ||, ^, &, |
		 */
		int num1 = 10, num2 = 20;
		
		boolean result = num1 > num2;
		/*
		 		>=, <, <=
		 	num1 과 num2 의 수치를 비교하여 결과를 result 변수에 저장하여 출력
		 */
		System.out.println("num1 > num2 : " + result);
		
		result = num1 >= num2;
		System.out.println("num1 >= num2 : " + result);
		
		result = num1 < num2;
		System.out.println("num1 < num2 : " + result);
		
		result = num1 <= num2;
		System.out.println("num1 <= num2 : " + result);
		
		// num1에 저정된 값과 num2에 저장된 값의 데이터 타입과 값이 일치하면 true 아니면 false
		result = num1 == num2; // 10 == 20, false
		System.out.println(result);
		
		// num1에 저정된 값과 num2에 저장된 값의 데이터 타입과 값이 일치하지 않으면 true 아니면 false
		result = num1 != num2; // 10 != 20, true
		System.out.println(result);
		
		String str = "이유리";
		//문자열의 수치를 비교할 수 없으므로 문법 오류(컴파일 오류)
		//result = num1 > str;
		String str2 = "이유리";
		result = str == str2;
		System.out.println("str == str2 : " + result);
		
		//문자열 수치 비교는 불가
		//result = str >= str2;
		
		
		////////////////////////////////////////////
		//논리 비교 연산자
		num1 = 10;
		num2 = 22;
		
		// 논리연산식 && 논리연산식
		// 논리곱 : 둘다 참일 때 true, 둘중에 하나라도 거짓이면 false
		//                      false   &&    true
		boolean boolResult = (num1 < 0) && (num2 > 0);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("boolresult : " + boolResult);
		
		System.out.println("--------------------------------------------");
		// || 논리합
		//둘중에 하나라도 참이면 true
		//둘 다 거짓일 떄만 false
		boolResult = (num1++ > 0) || (num2++ > 0);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("boolresult : " + boolResult);
		
		//^ 배타 연산자 
		//좌항과 우항의 값이 틀리면 true, 값이 일치하면 false
		boolResult = (num1 > 0) ^ (num2 > 0);
		System.out.println("boolresult : " + boolResult);
		
		// &, |, ^
		// 각 비트의 자리수를 연산 하는 비트 연산자
		num1 = 10;
		/*
		 	2 L 10
		 	2 L  5 ...0
		 	2 L  2 ...1
		 		 1 ...0
		 		 
		 	이진법
		 	[0] [0] [0] [0] [1] [0] [1] [0] == 10
		 	  
		 */
		num2 = 20;
		/*
	 	2 L 20
	 	2 L 10 ...0
	 	2 L  5 ...0
	 	2 L	 2 ...1
	 	  L  1 ...0
	 		 
	 	이진법
	 		64	32	16	 8	 4	 2	 1
	 	[0] [0] [0] [1] [0] [1] [0] [0] == 20
	 				16       4
	 	  
	 */
	// [0] [0] [0] [0] [1] [0] [1] [0] == 10
	// [0] [0] [0] [1] [0] [1] [0] [0] == 20
	// [0] [0] [0] [0] [0] [0] [0] [0] == 0
		int op = num1 & num2;
		System.out.println("num1 & num2 : " + op);
		
		op = num1 | num2;
		// [0] [0] [0] [0] [1] [0] [1] [0] == 10
		// [0] [0] [0] [1] [0] [1] [0] [0] == 20
		//			   16	8   4   2
		// [0] [0] [0] [1] [1] [1] [1] [0] == 30
		System.out.println("num1 | num2 : " + op);
					    
		// 두 비트의 값이 틀릴때만  true
		// 0이든 1이든 같으면 false
		// [0] [0] [0] [0] [1] [0] [1] [0] == 10
		// [0] [0] [0] [1] [0] [1] [0] [0] == 20
		//			   16	8   4   2
		// [0] [0] [0] [1] [1] [1] [1] [0] == 30
		op = num1 ^ num2;
		System.out.println("num1 ^ num2 : " + op);
		
		num2 = 22;
		// [0] [0] [0] [0] [1] [0] [1] [0] == 10
		// [0] [0] [0] [1] [0] [1] [1] [0] == 22
		//			   16	8   4   
		// [0] [0] [0] [1] [1] [1] [0] [0] == 28
		op = num1 ^ num2;
		System.out.println("num1 ^ num2 : " + op);
		
		// shift 연산자
		// java에서는 3개의 shift 연산자를 가지고 있음.
		// 피연산자의 비트열을 이동시켜 연산하는 연산자
		/*
		 	<< : 피연산자의 비트열을 왼쪽으로 이동시키며 이동에 따른 빈공간은 0으로 채움
		 	>> : 피연산자의 비트열을 오른족으로 이동, 이동에 따른 빈공간은 부호비트로 채움
		 	>>> : 피연산자의 비트열을 오른쪽으로 이동, 이동에 따른 빈공간은 0으로 채움
		 */
		byte num = 5;
		//	    64  32  16  8   4   2   1
		// [0] [0] [0] [0] [0] [1] [0] [1] == 5;
		//						4       1  == 5;
		// [0] [0] [0] [0] [0] [0] [0] [1] == 1;
		//[1byte][1byte][1byte][[0] [0] [0] [0] [0] [0] [0] [1]]
		// 형 변환 : 연산결과인 int type의 데이터를 byte type으로 변환
		// 타입 캐스팅 또는 타입 변환
		byte shiftResult = (byte)(num >> 2);
		System.out.println("ShiftResult : " + shiftResult);
		
		//	    64  32  16  8   4   2   1
		// [0] [0] [0] [1] [0] [1] [0] [0] == 20;
		shiftResult = (byte)(num << 2);
		System.out.println("ShiftResult : " + shiftResult);
		
		//	    64  32  16  8   4   2   1
		// [0] [0] [0] [0] [0] [1] [0] [1] == 5;
		// [0] [0] [0] [0] [0] [0] [0] [1] == 1;
		// 오른쪽으로 2비트 만큼 이동하나 새로 생긴 빈자리는 0으로 채움
		shiftResult = (byte)(num >>> 2);
		System.out.println("ShiftResult : " + shiftResult);
		
		num = -5;
		//	    64  32  16  8   4   2   1
		// [0] [0] [0] [0] [0] [1] [0] [1] == 5;
		// [1] [1] [1] [1] [1] [0] [1] [0] + 1 //
		// [1] [1] [1] [1] [1] [0] [1] [1] == -5;
		// -1*  64  32  16  8   4   2   1
		// -1*64+(32+16+8+4+2+1) == -64 + 59 == -5;
		
		// [1] [1] [1] [1] [1] [0] [1] [1] == -5;
		// [1] [1] [1] [1] [1] [1] [1] [0] == -5;
		// -1*  64  32  16  8   4   2   
		// -1*64+(32+16+8+4+2) == -64 + 62 == -2;
	
		// >> 오른쪽으로 2칸 이동 하고 남은 자리를 부호비트
		shiftResult = (byte)(num >> 2);
		System.out.println("ShiftResult : " + shiftResult);
		
		// >>> 오른쪽으로 2칸 이동하고 남은 자리를 0으로 채움
		// [1] [1] [1] [1] [1] [1] [1] [0] == -5;
		// [1] [0] [0] [1] [1] [1] [1] [0] == -2;
		// -1*		   16 + 8 + 4 + 2    // -16 + 14 == -2
		shiftResult = (byte)(num >>> 2);
		System.out.println("ShiftResult : " + shiftResult);
		
		
		
		
	}
	
}
