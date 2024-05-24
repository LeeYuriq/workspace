package b_default;

public interface Printable {
	
	// 재정의 해야함
	void print();
	
	// 공통 규격이지만 무조건 재정의 해야하는 메소드는 아님.
	default void threeDPrint() {
		
	}
	
}
