
public class for_print {

	public static void main (String[] args) {
		
		for(int i = 2 ; i < 10 ; i++) {
			
			for(int j = 2 ; j < 10 ; j++){
				 System.out.print(j+ " * "+i+" = " +(j * i)+"\t");          
		        }//내부 for문

			System.out.println();

		}// 외부 for문
		
	}// end main
	
}// end class
