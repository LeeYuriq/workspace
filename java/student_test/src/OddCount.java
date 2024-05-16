public class OddCount {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int count = 0;
        
        for(int i = 0; i<numbers.length ;i++) {
        	if(numbers[i] % 2 == 1) {
        		count++;
        	}else {
        		continue;
        	}
        		
        }// for문
        
        System.out.print("홀수의 개수는 : " + count);
        
    } //end main

} // end class