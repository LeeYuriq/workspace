package test3_1;

public class Test {

	public static void main(String[] args) {
		int score = 95;
		char grade;

		/*
		if (score > 90) {
			grade = 'A';
		} else {
			if(){
			grade = 'B';
			}else{
			grade = 'C';
			}
		}
		*/
		
		grade = (score > 90) ? 'A' : 'B';
		//grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		
		System.out.println(grade);
	}

}
