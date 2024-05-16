package student_test_0516;

public class Car {

	String color;
	int speed;
	int gear;
	
	
	//기본생성자
	Car(){}
	
	
	int speedUp(){
		return speed +=10;
	}
	
	
	int speedDown(){
		return speed -=10;
	}
	
	
	String showInfo(){
		return "Car [color=" +color+", speed="+speed+", gear="+gear+"]";
	}
	
}//end public class Car
