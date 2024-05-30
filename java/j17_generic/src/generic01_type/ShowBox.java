package generic01_type;

// 클래스명<이 클래스에서 임시로사용할 것> 
// 객체 사용시에 타입을 명시해서 사용한다.
public class ShowBox<T> {

	private T fruit;

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
