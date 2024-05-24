package c_interface_extends;

public interface A {
	
	// 메소드명 앞에 public abstract가 생략되어있다
	void methodA();
	
	default void methodB() {
		System.out.println("A interface의 default methodB");
	}
	
	//정적 멤버 메소드는 클래스이름과 인터페이스 이름으로 접근 가능하다.
	//다른 메소드와 충돌 안됨
	static void methodC() {
		System.out.println("A class의 methodC");
	}
	
}


interface B{
	void methodA();
	void methodB();
	
}


// interface 간의 상속은 구현되지 않은 메소드를 상속받는것이다.
// A와 B에 있는 메소드, 그리고 C자신이 가진 메소드를 구현해야 실행가능하다.
// 메소드이름이 중복되어도 C 인터페이스를 구현하는 곳에서는 C인터페이스에 있는 메소드를 구현한다. 
// C 인터페이스에서 재정의 해야한다
interface C extends A, B{
	void methodC();

	@Override
	default void methodB() {
		System.out.println("C interface의 methodB");
	}
	
}
