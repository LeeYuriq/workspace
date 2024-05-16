package GUIDE.account;

import java.util.Scanner;

public class BankApplication {
	
	Account[] account = new Account[100];
	
	Scanner sc = new Scanner(System.in);
	
	BankApplication(){
		run();
	}
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		Account ac = new Account();	
		
			for (int i = 0; i < account.length; i++) {
				System.out.print("계좌주 : ");
				String owner = sc.next();
				System.out.print("계좌번호 : ");
				String ano = sc.next();
				System.out.print("초기입금액 : ");
				int balance = sc.nextInt();;
				System.out.print("비밀번호 : ");
				String password = sc.next();
				
				ac.owner = owner;
				ac.ano = ano;
				ac.balance = balance;
				ac.password = password;
				account[i] = ac;
				
				System.out.print("더 만드시겠습니까? Y / N > ");
				String mCreate = sc.next();
				if(mCreate.equals("Y")||mCreate.equals("y")) {
					System.out.println("계좌생성이 완료되었습니다.");
					System.out.println("계좌를 더 개설합니다.");
					continue;
				}else if(mCreate.equals("N")||mCreate.equals("n")) {
					System.out.println("계좌를 그만 개설합니다.");
					break;
				}else {
					System.out.print("Y(네) / N(아니오) 중에 선택해주세요");
					break;
				}//if
			}//end for문		
		System.out.println("계좌생성이 완료되었습니다.");
	}// void createAccount
	
	
	
	// 계좌조회
	void selectAccount() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
			
		for(Account ac : account) {
			if(ac != null) {	
				String ts = ac.toString();
				System.out.println(ts);
			}else {
				break;
			}//if
		}//for
	}// void selectAccount
	
	
	
	// 예금
	void deposit() {
		System.out.println("--------------");
		System.out.println("예금"); 
		System.out.println("--------------");
	
		for (int i = 0; i < account.length; i++) {	
		System.out.print("계좌번호 : ");
		String inputAno = sc.next();
		System.out.print("비밀번호 : ");
		String inputPw = sc.next();
		System.out.print("예금액 : ");
		int inputM = sc.nextInt();;
		
		if(inputAno.equals(account[i].ano) && inputPw.equals(account[i].password)) {
			System.out.println(account[i].owner  +"님의 계좌 입금이 완료 되었습니다.");
			
			break;
		}else {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			continue;
		}//if

		
		
		}//for
		
	}// void deposit
	
	
	
	//출금
	void withdraw() {
		
	}// void withdraw
	
	
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
