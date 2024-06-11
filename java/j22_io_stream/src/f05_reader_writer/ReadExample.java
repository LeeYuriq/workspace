package f05_reader_writer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReadExample {

	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("C:\\Temp\\data.hwp")){
			
			int readData;
			
			/*
			while(true) {
				// 2byte에 문자 기반으로 입력
				readData = reader.read();
				System.out.println(readData);
				// EOF == -1 (더 이상 읽을게 없다는것)
				if(readData == -1) {
					break;
				}
				System.out.println(readData);
				System.out.println((char)readData);
			}
			*/
			
			char[] chars = new char[100];
			// readData 가 -1 이 아닌 동안 반복, -1이 되면 더이상 읽을게 없으며 그때 반복문 종료됨
			while((readData = reader.read(chars)) != -1) {
				System.out.println("읽은 문자 수 : " + readData);
				System.out.println(Arrays.toString(chars));
				String result = new String(chars,0,readData);
				System.out.println(result);
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}// end main method

}// end ReadExample class
