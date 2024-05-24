package c_interface_extends;

public class MyClass implements C{



	@Override
	public void methodA() {
		System.out.println("MyClass의 methodA 호출");
	}

	/*
	@Override
	public void methodB() {
		System.out.println("MyClass의 methodB 호출");
	}
	*/

	@Override
	public void methodC() {
		System.out.println("MyClass의 methodC 호출");
	}
	
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.methodA();
		myClass.methodB();
		myClass.methodC();

		// A인터페이스에 있는 정적메소드C를 호출하는것
		A.methodC();
	}
	
}
