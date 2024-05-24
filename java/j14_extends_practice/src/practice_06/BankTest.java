package practice_06;

/**
 * Bank Class 생성
 * Bank Class 를 상속 받는 BadBank, NormalBank, GoodBank class 작성 
 *
 */

//추상(abstract) 메소드를 클래스 내에 하나라도 포함하고 있으면, 인스턴스를 생성할 수 없는 추상 클래스가 되어야한다.
abstract class Bank{
	
	// 기능을 정의하지 않음. 자식개체에서 무조건 다시 재정의 해야한다.
	// 기능을 정의 하지 않으면 삭제 {} 가능
	abstract double getInterestRate();
	
}

// Bank 클래스를 상속받음
class BadBank extends Bank{

	// 상위클래스인 Bank에 있는 메소드 기능을 사용함. 재정의
	@Override
	double getInterestRate() {
		return 10.0;
	}
	
}

class NormalBank extends Bank{

	@Override
	double getInterestRate() {
		return 5.0;
	}
	
}

class GoodBank extends Bank{

	@Override
	double getInterestRate() {
		return 3.0;
	}
	
}


public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new BadBank();
		Bank b2 = new NormalBank();
		Bank b3 = new GoodBank();
		
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());	
		
		//추상 클래스는 독립적으로 객체 생성 불가, 구체화 되지 않은 기능을 가지고 있기 때문에
		//Bank bank = new Bank();
		//추상 클래스는 상속받아 추상메소드의 기능을 구현한
		//실체(자식)클래스 로만 인스턴스 생성 
		Bank bank = new GoodBank();
		
		
		// 클래스 블럭{}을 사용하여 재정의 할 수 있음.
		// 객체생성시에 임의로 재정의하여 구현하고있음.
		// 생성자는 정의할 수 없다.
		Bank oneGradeBank = new Bank() {	// **익명 구현 객체** : 동일한 이름을 사용하여 객체를 사용할 수 없고,
			// 변수로만 접근가능한거지 class내에서 재활용하여 사용할 수 없다.
			// 이 기능을 사용하려면 똑같이 객체를 만들어 줘야한다.
			private double interestRate = 1.0;
			@Override
			double getInterestRate() {
				return this.interestRate;
			}
		};// end oneGradeBank 선언
		
		System.out.println("oneGradeBank 이자율 : " + oneGradeBank.getInterestRate());
	}

}
