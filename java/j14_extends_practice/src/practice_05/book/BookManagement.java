package practice_05.book;

import java.util.Scanner;

public class BookManagement {
	
	// 문자열 입력
	private Scanner scanLine = new Scanner(System.in);
	// 선택번호 입력
	private Scanner scanSelectnum = new Scanner(System.in);
	
	// 도서목록
	private static Book[] books = new Book[100];
	// 프로그램 실행 flag
	private boolean isRun = true;
	// 메인 메뉴 선택 번호
	private int selectNo = 0;
	// 도서관리 번호
	private int count = 1;	

	public BookManagement(){}
	
	public void run() {
		while(isRun) {
			System.out.println("================================================");
			System.out.println("1.도서등록 | 2. 도서목록 | 3.도서수정 | 4.도서삭제 | 5. 종료");
			System.out.println("================================================");
			selectNo = getSelectNum("번호를 선택하세요>");
			
			switch(selectNo) {
				case 1 :
					registerBook();
					break;
				case 2 :
					selectBook();
					break;
				case 3 :
					updateBook();
					break;
				case 4 : 
					deleteBook();
					break;
				case 5 : 
					terminate();
					break;	
				default : 
					System.out.println("등록된 메뉴가 아닙니다.");
			}
		}
	}
	
	
	// 프로그램 종료
	public void terminate() {
		this.isRun = false;
		System.out.println("프로그램 종료");
	}

	
	// 도서 등록
	public void  registerBook() {
		System.out.println("1. 도서등록");
		String title = getData("등록할 도서의 제목을 입력해 주세요 >");
		String author = getData("등록할 도서의 저자를 입력해 주세요 >");
		
		//books 배열에 저장될 Book 객체를 생성
		Book book = new Book();
		
		// Book 클래스의 인스턴스멤버 num, title, author의 접근제한자가 private이므로
		// 외부 클래스에서 직접적으로 사용할 수 없다.
		// 그래서 사용할 시 값을 입력할 때는 간접적으로 접근하는 Setter를 사용한다.
		book.setTitle(title);
		book.setAuthor(author);
		
		// 배열의 수가 100으로 정해져 있으니 정해진 값을 반복할때 사용하는 for 반복문을 사용하고,
		// 비어있는 books 배열에 Book 객체를 저장한다.
		for(int i = 0; i < books.length; i++) {
			// [i] 번째 배열이 null이면 Book 객체를 저장한다. 
			if(books[i] == null) {
				// 변수 count에 1 이라는 값이 들어있으니, 
				// 빈 배열에 도서를 등록할 때 마다 배열의 인덱스번호 + 1이 도서관리번호가 된다.
				book.setNum(i+count);
				// 비어있는 books[i] 번째 배열에 book에 저장된 Book객체를 저장한다  
				books[i] = book;
				System.out.println("등록완료");
				//도서를 등록한 후 for 문을 탈출하여 while 문으로 돌아간다. 
				break;
			}// end if 문
		}// end for 문
	}// end  registerBook method
	
	
	// 도서 목록 출력
	public void selectBook() {
		System.out.println("2. 도서목록");
		// Book 타입의 변수 b 는 books 배열을 순회한다. 
		for(Book b : books) {
			// books 배열중 null이 아닌 값들을 출력한다.
			if(b != null) {
				// 변수 b 를 toString 메소드에 작성한 양식으로 문자열 값을 출력한다.
				// b.를 적지않고 toString()만 적게되면 배열의 주소가 출력된다.
				String into = b.toString();
				System.out.println(into);
			}// end if 문
		}// end for 문
	}// end selectBook method
	

	// 도서 정보 수정
	public void updateBook() {
		System.out.println("3. 도서수정");
		int bookNum = getSelectNum("수정 하실 책의 관리번호를 입력해주세요.");
		
		/*
		 	사용자에게 입력받은 bookNum을 매개변수로 사용하는 findBook 메소드를 
			Book 타입의 updateB 에 대입함
		*/
		Book updateB = findBook(bookNum);
		// 사용자에게 입력받은 숫자의 배열이 null이면 print의 값을 출력   
		if(updateB == null) {
			System.out.println("존재하지 않는 도서관리번호 입니다.");
			return; // findBook 메소드에서 입력한 값이 존재하지 않는 경우 반환하는 값(null)이 
			//작성되어 있으므로 return을 써주고 if문을 나온다.
		}// end if 문
		
		// 사용자에게 입력받은 도서관리번호가 존재하면 
		// updateB에 저장된 배열에 저장된 정보를 toString()메소드의 양식으로 출력
		System.out.println(updateB.toString());
		
		//while을 종료할 때 run method에 있는 while이 같이 종료되면 안되므로 새로운 boolean 타입의 변수를
		//만들어 updateBook 메소드만 종료될 수 있도록 한다. 종료시에 값을 false로 대입해준다.
		//true 일 때는 반복문이 계속 반복된다.
		boolean isUpdate = true;
		
		while(isUpdate) {
			System.out.println("================================");
			System.out.println("1.제목수정 | 2. 저자수정 | 3.수정완료");
			System.out.println("================================");
			selectNo = getSelectNum("번호를 선택하세요>");
			
			switch(selectNo) {
			case 1 :
				System.out.println("제목 수정"); 
				// getData 메소드의 매개변수로 값을 입력받기위한 문자열을 입력하고
				// 그 값을 문자열 타입의 변수 title에 대입한다.
				String title = getData("제목입력 >");
				// Book class의 인스턴스멤버인 title이 private 접근제한자이므로
				// 간접적으로 접근해서 값을 입력하기위해 Setter를 이용하여 updateB에 사용자에게 
			 	// 입력받아 저장한다.
				updateB.setTitle(title);
				System.out.println("제목 수정 완료");
				break;
			case 2 :
				// case 1의 title과 같은 방식이다.
				System.out.println("저자 수정");
				String author = getData("저자입력 > ");
				updateB.setAuthor(author);
				System.out.println("저자 수정 완료");
				break;
			case 3:
				System.out.println("수정완료");
				// while문 종료하기 위해 isUpdate값을 false로 재할당한다.
				isUpdate = false;
				break;
				}// end switch
			}//end while
		}// end updateBook method
		
		
	// 도서 목록에서 책 정보 삭제
	public void deleteBook() {
		System.out.println("4. 도서삭제");
		int bookNum = getSelectNum("삭제할 도서의 관리번호를 입력해주세요.");
		
		// Book 타입의 book 변수에, findBook 메소드의 매개변수로 사용자에게 bookNum을 입력받아 메소드를 동작시킨다 
		Book book = findBook(bookNum);
		
		// 입력한 도서관리번호의 배열에 정보가 비어있으면 문자열을 출력한 후 
		if(book == null) {
			System.out.println("입력하신 도서관리번호 책이 존재하지 않습니다.");
			// findBook 메소드의 null을 반환하며 종료된다.
			return;
		}
		
		// 
		for(int i = 0; i < books.length; i++) {
			// books[i]번째 배열이 null 아니면서 사용자에게 입력받은 도서관리번호를 가진 배열과
			// books[i]번째 배열의 정보가 같을 때, 그 배열의 값을 null로 재할당한다.
			if(books[i] != null && books[i] == book) {
				books[i] = null;
				System.out.println("삭제완료");
				// 원하는 배열 삭제 됐으면 반복문 탈출
				break;
			}
		}
	}//end deleteBook method
	
	
	// 도서관리번호로 책 정보 찾기
	public Book findBook(int num) {
		for(Book b : books) {
			// b에 대입된 배열의 값이 null이 아니면서 b에 대입된 도서관리번호와 
			// 매개변수로 입력받는 값이 일치하면
			// books 배열을 순회하며 저장된 정보를 반환한다.
			if(b != null && b.getNum() == num) {
				return b;
			}
		}
		//for 문이 끝나도 원하는 값을 찾지 못할 때에 반환될 값
		return null;
	}// end findBook method
	
	
	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getData(String message) {
		System.out.println(message);
		return scanLine.nextLine();
	}
	
	// 번호 선택 받기
	int getSelectNum(String message) {
		System.out.println(message);
		if(!scanSelectnum.hasNextInt()) {
			System.out.println("숫자를 입력해주세요.");
			scanSelectnum.next();
			return 0;
		}
		return scanSelectnum.nextInt();
	}
		
}




