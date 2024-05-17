package test2_2;

public class Car {

	String color;
	int speed;
	int gear;
	

	public String showInfo() {
		return "Car[color= " +color+ ", speed= "+speed+ ", gear= "+gear+ "]";
	}


	public void speedUp() {
		//객체가 가진 speed field의 값을 10 증가
		this.speed += 10;
		
	}


	public void speedDown() {
		this.speed -= 10;
		
	}
	

}
