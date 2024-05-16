
public class Practice08GuGuDanExample {

	public static void main(String[] args) {
		/*
		 * 9 ~ 2 단까지의 구구단 출력 
		 */
		
		// 9단 출력
		
		for(int i = 9; i > 1; i --){
			 System.out.print("9 * "+i+" = " +(9 * i)+"\t");          
	        }
		System.out.println("\n===========================");
		
		for(int j = 9;j >= 2; j--) {
			for(int i = 9; i > 1; i --){
				 System.out.print(j+ " * "+i+" = " +(j * i)+"\t");          
		        }
			System.out.println();
		}
		
		
	}//end main
}// end class
