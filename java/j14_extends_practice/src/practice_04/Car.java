package practice_04;

public class Car {
	
	//인스턴스멤버
	String color;
	int speed;
	int gear;
	
	//기본생성자
	Car(){}
	
	
	// Car class의 changeGear method를 사용할 때 인스턴스 멤버인 gear를 매개변수로 사용함
	public void changeGear(int gear) {
		this.gear = gear;
	}// end changeGear method
	
	// speedUp()메소드를 선언하면 인스턴스 멤버 speed가 10증가함
	public void speedUp() {
		this.speed +=10;
	}// end speedUp method
	
	// speedDown()메소드를 선언하면 인스턴스 멤버 speed가 10감소함
	public void speedDown() {
		this.speed -=10;
	}// end speedDown method
	
	/*
	 	현재 class 옆에 보이지 않지만 Object class를 상속받으며,
	 	toString()메소드를 사용하여 문자열 양식을 작성하면, 작성한 문자열 타입으로 반환함.
	 */
	public String toString() {
		return "Car [color=" +color+ " speed=" +speed+ " gear=" +gear+ "]";
	}//end toString method
	
	
}// end Car class
