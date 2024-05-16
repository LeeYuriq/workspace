package h_practice;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		/*
		Student s1 = new Student();
		s1.number  = 1;
		s1.name = "최기근";
		s1.score = 100;
		
		System.out.println(s1.getInfo());
		
		Student s2 = new Student(2,"이다한",98);
		String info = s2.getInfo();
		System.out.println(info);
		*/
		
		//줄바꿈이 없는 값을 입력받는 Scanner
		Scanner sc = new Scanner(System.in); //import추가 : ctrl + shift + o
		
		//한 라인을 입력받는 Scanner
		Scanner scLine = new Scanner(System.in);
		
		//학생 정보를 저장할 배열 
		Student[] students = null;
		
		while(true) {
			System.out.println("====================================");
			System.out.println("1.학생수|2.정보입력|3.정보확인|4.분석|5.종료");
			System.out.println("====================================");
			System.out.println("메뉴 번호를 입력해 주세요(1~5) > ");
			//console에서 정수값을 입력받아 selectNo변수에 저장
			int selectNo = sc.nextInt();
			/*
			 	1.학생수를 입력받아 Student 객체가 저장될 students 배열 생성
			 	 - 입력받은 학생 수 만큼의 크기를 가짐.
			 	2.생성된 students 배열의 항목 수만큼(배열의 크기만큼)
			 	  학생의 정보를 입력받아 Student 객체를 생성하여 저장하고
			 	  배열항목에 저장
			 	   - int(number), String(name), int(score)
			 	   sc.next();	//console을 통해서 문자열 입력받음
			 	3.students 배열에 저장된 학생들의 정보를 출력(field 정보 출력)
			 	4. 1.students 배열에 저장된 학생들의 점수를 전체합계, 평균을 구해서 출력
			 	   2.students 배열에 저장된 학생들의 점수를 연산하여
			 	     최고득점자 이름, 최저득점자의 이름을 출력
			 	5.프로그램 종료
			 */
			
			//selectNo 부여된 번호에 따라 기능 분류
			if(selectNo == 1) {
				System.out.println("1. 학생 수 입력");
				//console에서 학생 수를 정수로 입력받아 stuCount 변수에 저장
				int stuCount = sc.nextInt();
				//학생 수만큼 학생정보를 저장할 배열 생성
				students = new Student[stuCount];
				//input stuCount : 3
				//			 0		 1  	2
				//students [null] [null] [null]
				System.out.println("학생 수는" + students.length + " 입니다");
				
			}else if(selectNo == 2) {
				System.out.println("2. 학생 정보 입력");
				//배열에 저장할 Student 객체 생성
				//생성된 객체에 등록할 학번, 이름, 점수를 입력받음.
				for (int i = 0; i < students.length; i++) {
					
					//학번은 1에서 부터 1씩 순차적으로 증가
					int num = i + 1;
					System.out.println(num+"번째 학생 정보 입력");
					System.out.println("학생의 이름을 입력해 주세요.");
					//sc.next = 한 단어를 입력 받음
					//sc.nextLine = 공백을 포함한 한 줄의 문장을 입력받음
					String name = scLine.nextLine();
					
					System.out.println("학생의 점수를 입력해 주세요.");
					int score = sc.nextInt();
					
					Student stu = new Student();
					stu.number = num;
					stu.name = name;
					stu.score = score;
					//사용자가 입력한 정보를 저장하고 있는 Student 객체 정보를 
					//students 배열의 i번째 인덱스 항목에 저장
					students[i] = stu;
					
				}//end for문
				
				
			}else if(selectNo == 3) {
				System.out.println("3. 학생 정보 확인");
				//students 배열에 등록된 Student 객체 - 학생 정보 출력
				for(Student s : students) {
					String info = s.getInfo();
					System.out.println(info);
				}// end 향상된 for 문
				
			}else if(selectNo == 4) {
				System.out.println("4. 학생 정보 분석");
				//전체합계(총점), 평균, 최고-최저 득점자 이름
				int total = 0;		//총점
				double avg = 0;		//평균
				//최고 최저 점수를 가진 학생 정보를 저장할 변수
				Student stuMax, stuMin;
				//비교를 위하여 배열 0번째 인덱스의 학생 정보로 변수의 값 초기화
				stuMax = stuMin = students[0];
				for(int i = 0; i < students.length; i++) {
					
					//등록된 모든 학생의 정보를 더하여 total 변수에 저장 
					total += students[i].score;
					
					//stuMax에 저장된 학생의 점수보다
					//students[i]에 저장된 학생의 점수가 크면
					//stuMax에 큰 점수를 가진 학생 정보를 저장
					if(stuMax.score < students[i].score) {
						stuMax = students[i];
					}
					
					//stuMin에 저장된 학생 점수 보다
					//현재 배열 항목에 저장된 학생 점수가 작으면
					//최저 점수를 가진 학생 정보를 저장하는 stuMin 변수에 현재
					//배열 항목에 저장된 학생 정보를 저장
					if(stuMin.score > students[i].score) {
						stuMin = students[i];
					}
					
				}//end for
				 System.out.println("전체합계 : " +total);
				// 정수 / 정수 == 결과 타입은 int
				 // double / 정수 == 결과 타입은 double
				 avg = (double)total / students.length;
				 System.out.println("평균점수 : " +avg);
				 System.out.println("최고득점자 : " + stuMax.name);
				 System.out.println("최저득점자 : " + stuMin.name);
				
				
			}else {
				 System.out.println("프로그램을 종료");
				 //while 반복문 즉시 탈출
				 break;
			}
			

		}//while
		
		
		
	}//end main
	
}// end StudentManagement class
