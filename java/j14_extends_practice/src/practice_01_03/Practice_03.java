package practice_01_03;

public class Practice_03 {

	public static void main(String[] args) {
		// code 작성
		int[] ten = new int[10];
		
		//10개의 난수 발생시켜 배열에 저장
		for(int i = 0; i < ten.length; i++) {
			ten[i] = (int)(Math.random() * 100 + 1);
			//중복방지
			for(int j = 0; j < i ; j++) {
				if(ten[i] == ten[j]) {
					i--;
					break;
				}//end if
			}//end 내부 for 문
		}// end 외부 for 문
		
		System.out.print("최초의 리스트 : ");
		for (int i : ten) {
			System.out.print(i+" ");
		}// for 배열순회
		
		
		/*
		 	예시로 ten[0]에 저장된 수가 ten[1]보다 작을 때 
		 	ten[0]에 있는 값을 변수 box에 저장시키고,
		 	ten[0]에 ten[1]의 값을 저장, ten[1]에 box의 값을 저장하여 
		 	왼쪽에는 큰 수, 오른쪽으로 갈수록 작은 수가 나열된다.(내림차순)
		 */
		for(int i = 0; i < ten.length; i++) {
			for(int k = i+1; k < ten.length; k++) {
				if(ten[i] < ten[k]) {
					int box = ten[i];
					ten[i] = ten[k];
					ten[k] = box;
				}// end if 문
			}// end 내부 for 문
		}// end 외부 for 문
		
		System.out.println();
		System.out.print("정렬된 리스트 : ");
		for (int i : ten) {
			System.out.print(i+" ");
		}// for 배열순회
		
	}// end main method
}//end Practice_03 class 
