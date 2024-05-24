package a_base;

public interface RemoteControl {
	
	// interface에는 *상수와 추상메소드*만 선언 가능하다.
	
	public static final int MAX_VALUE = 30;
	//interface은 따로 선언하지 않아도
	//field가 자동으로 **public static final**이 된다.
	int MIN_VALUE = 0;
	
	//interface 실체화된 기능이 없는 추상 메소드만 선언 가능(기능을 가질 수 없다{})
	//void setValue (int value) {}
	public abstract void turnOn();
	//method가 자동으로 **public abstract**이 된다.
	void turnOff();
	void setValue(int value);
	
}
