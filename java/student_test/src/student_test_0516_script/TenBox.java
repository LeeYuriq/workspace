package student_test_0516_script;

public class TenBox {

	public static void main(String[] args) {

		int[] ten = new int[10];
				
		for(int i = 0; i < ten.length; i++) {
			ten[i] = (int) ((Math.random()*100) + 1);
			for(int j = 0; j < i ; j++) {
				if(ten[i] == ten[j]) {
					i --;
					break;
				}//end if
			}//end 내부 for
		}//end 외부 for
					
		//난수 총합계
		int sum = 0;
		for(int i = 0; i < ten.length; i++){
			sum += ten[i];
		}
				
		//출력
		for(int i : ten) {
			System.out.print(i + " ");
		}
			System.out.print("난수 총합계 : " + sum);
		
	}//end main

}// end Math
