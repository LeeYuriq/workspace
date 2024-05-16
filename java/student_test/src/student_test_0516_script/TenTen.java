package student_test_0516_script;

public class TenTen {

	public static void main(String[] args) {
		//배열 10개 생성
		int[] ten = new int[10];
		
		
		//1~100까지 난수 발생해 배열 10개에 값 담기
		for(int i = 0; i < ten.length; i++) {
			ten[i] = (int) ((Math.random()*100) + 1);
			for(int j = 0; j < i ; j++) {
				if(ten[i] == ten[j]) {
					i --;
					break;
				}
			}
		}
		
		
		//최초의 리스트
		System.out.print("최초의 리스트 : ");
		for(int i : ten) {
			System.out.print(i + " ");
		}

		
		//정렬
		for(int i = 0; i < ten.length; i++) {
			for(int j = i+1; j < ten.length; j++) {
				if(ten[i] > ten[j]) {
					int temp = ten[i];
					ten[i] = ten[j];
					ten[j] = temp;
				}
			}
		}
		
		
		System.out.println();
		//정렬된 리스트
		System.out.print("정렬된 리스트 : ");
		for(int i : ten) {
			System.out.print(i + " ");
		}
		
	}//end main
	
}//end class
