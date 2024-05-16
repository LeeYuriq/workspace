package a2_class;

//현재 소스코드 파일과 다른 패키지에 정의된 클래스를 사용하려면
//해당 클래스의 위치를 알려줘야함.
import a1_class.A;
// import a1_class.B; (class 접근 제한자가 default로 되어있기때문에 public으로 바꾼다)

public class C {
	
	a1_class.A a = new a1_class.A();
	A a1 = new A();
	
	// B b = new B();
	
}
