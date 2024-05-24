package practice_01_03;

public class Practice_02 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		// int number = (int) (Math.random() * 45 + 1); // 참고
		
		//***중복제거, 정렬 : 오름차순
		//System.out.println(lotto[0]);
		//System.out.println(lotto[4]);
		
		for(int u = 0; u < lotto.length; u++) {
			lotto[u] = (int) (Math.random() * 45 + 1);
			// 앞의 배열에 발생된 난수와 중복방지하는 for문.
			// : 예를들어 외부 for 문 에 의해 lotto[0]에 26번이 들어가 있는데
			// 내부 for 문이 실행될때 lotto[1] 이 lotto[0]과 같은 26을 저장하고 있으면
			// 배열로 돌아가게한 후, 현재 실행되고 있는 곳을 빠져 나가서 다시 난수를 발생시켜 저장한다.
			/*(중복방지 조금 헷갈리는데, 설명해주시는 시간에 중복방지도 부탁드립니다...)*/
			
			// 항목에 등록된 배열 정보 출력
						System.out.print("[");
						for(int n : lotto) {
							System.out.print(n+", ");
						}
						System.out.println("]");
			
			// 등록하려는 항목 이전의 값이랑 중복되는지 비교
			for(int j = 0; j < u ; j++) {
				System.out.printf("%d == %d result : %b u : %d %n", lotto[u], lotto[j],(lotto[u] == lotto[j]),u);
				if(lotto[u] == lotto[j]) {
					// 동일한 값이 이미 배열에 등록이 되어있음
					// lotto[u]에 새로운 난수로 값 저장 
					// 배열 index 번호를 표현하는 u값을 1감소
					u --;
					break;
					//오름차순
				}else if(lotto[u] < lotto[j]){
					int box = lotto[u];
					lotto[u] = lotto[j];
					lotto[j] = box;
				}// end if 
			}// end 내부 for : 중복방지
		}// end 외부 for : 난수발생하여 배열에 저장
		
		
		/*
		for(int y = 0; y < lotto.length; y++) {
			//예시 : lotto[0]과 그 다음 배열 lotto[1]을 비교하게 됨.
			for(int t = y+1; t < lotto.length; t++) {
				// 변수를 하나 생성하여 비교하는 배열중에 큰수를 변수에 저장하고
				// 작은 수를 큰수가 있던 배열에, 변수에 저장해놨던 큰 수를 작은 수가 있던 배열에 저장시켜 가는것을
				// 배열의 총 길이보다 작을때까지 반복한다. 
				if(lotto[y] > lotto[t]) {
					int box = lotto[y];
					lotto[y] = lotto[t];
					lotto[t] = box;
				}//end if
			}//end 내부 for 문
		}//end 외부 for 문 : 앞의 배열과 비교하여 오른쪽으로 갈수록 수가 커지는 오름차순정렬
		*/
		
		
		
		// 결과 출력 코드 수정 x
		System.out.println("[ 결과 ]");
		for (int i : lotto) {
			System.out.print("[" +i+ "]");
		}// for 배열순회
	
	}// end main method
}// end Practice_02 class
