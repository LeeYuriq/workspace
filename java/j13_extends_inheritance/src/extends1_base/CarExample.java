package extends1_base;

class Car // extends Object 모든클래스가 상속받는것(Object = 최상위 객체)
{
	
	String company;
	int maxSpeed;
	
	Car(){
		super();
		System.out.println("Car 기본 생성자 호출");
	}
	
	Car(String company){
		this.company = company;
		System.out.println("Car company를 매개변수로 전달받는 생성자 호출");
	}
	
	
	public String toString() {
		return "Car [ company = "+this.company+", maxSpeed = "+this.maxSpeed+"]";
	}
		
}//end Car class


// Car 기능도 할 수 있다.
// Bus는 Car다.
class Bus extends Car{
	Bus(){
		super(); //자식 객체 생성 초기화 전 부모 생성자 호출
		//생략되면 컴파일러가 부모객체 기본생성자 호출 자동으로 추가.
		System.out.println("Bus 기본생성자 호출");
	}
}//end Bus class


//is a
// 택시는 차다
class Taxi extends Car{
	Taxi(String company){
		//this.company = company; //물려받은 재산이라 this.를 쓸 수도 있지만
		//super.company = company; //물려받은 재산을 super.로 명시적으로 표시
		super(company); //중복코드 사용할 필요 없이
		System.out.println("taxi company를 넘겨받는 생성자 호출");
	}
}//end Taxi class


public class CarExample {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.company = "KIA";
		bus.maxSpeed = 180;
		System.out.println(bus.toString());
		
		Taxi taxi = new Taxi("BMW");
		taxi.maxSpeed = 280;
		String str = taxi.toString();
		System.out.println(str);
	}
	
}
