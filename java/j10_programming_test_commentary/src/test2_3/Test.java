package test2_3;

public class Test {

	public static void main(String[] args) {
		
		String[] strs = new String[5];
		//strs[0] strs[1] strs[2] strs[3] strs[4]
		//[null]  [null]  [null]  [null]  [null]  
		System.out.println(strs[0].equals(strs[1]));
		//System.out.println(null.equals(null));
		//실제 instance가 아닌 null을 가지고 있는 객체 타입의 변수를 호출 할 떄 
		//발생하는 예외 - NullPorinterException
	}
}




