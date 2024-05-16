package a5_field_method;

public class B {

	A a = new A();
	
	//class 내부에는 필드, 생성자, 메소드 만 사용 가능해서 아래와 같은건 안된다.
	//a.field1 = 100;
	
	public B() {
		a.field1 = 200;
		a.field2 = 300;
		// private field 니까
		// 객체 외부에서 접근 불가능
		// a.field3 = 1000;
		
		a.publicMethod();
		a.defaultMethod();
		// A class 외부니까 호출 불가능(private)
		// a.privateMethod();
		
		
		
		
		
	}	
	
	
}
