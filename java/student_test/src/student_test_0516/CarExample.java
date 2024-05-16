package student_test_0516;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
		//speedUp method 호출 시 speed filed의 값 10 증가
		myCar.speedUp();
		myCar.gear = 2;
		System.out.println(myCar.showInfo());
		//speedDown method 호출 시 speed filed의 값 10 감소
		myCar.speedDown();
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
	}//end main
	
}//end class
