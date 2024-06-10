package exception_03_throws_exam;

public class Account {

	private long balance;	//잔고
	
	// 입금
	public void deposit(int money) {
		this.balance += money;
	}// end deposit method
	
	// 출금
	public void withdraw(int money) throws BalanceInsufficientException {
		if(this.balance < money) {
			String message = "잔고 부족 오류 : " + (money - balance)+"원 모자람";
			// throw 예외를 강제로 발생
			throw new BalanceInsufficientException(message);
			// 오류가 발생되었으므로 그 이하 코드는 수행되지 않고 메소드 종료
		}
		this.balance -= money;
	}// end withdraw method
	
	public String toString() {
		return "Account [ 잔고는 : "+this.balance+"원 ]";
	}// end toString method
	
}// end Account class
