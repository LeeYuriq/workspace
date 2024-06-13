package f06_buffered;

import java.io.*;

public class StreamReaderWriterExample {

	public static void main(String[] args) {

		// byte -> char
		// InputStreamReader
		// char -> byte
		// OutputStreamWriter
		// 문자 기반 성능 향상 보조 스트림
		// BufferedReader, BufferedWriter
		
		InputStream is = System.in;
		
		try {
			// inputStream => Reader => buffered
			Reader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader);
			
			// 보조스트림을 이용한 출력 스트림
			//								문자기반(바이트기반    *기반이 달라서 오류뜨는 것*
			BufferedWriter writer = new BufferedWriter(
					
				// 바이트 기반을 문자 기반으로 변환	
				new OutputStreamWriter(new FileOutputStream("C:\\Temp\\fos.txt", true))
					
					// 문자기반을 스트림을 전달하여 오류가 뜨지 않음
					//new FileWriter("C:\\Temp\\fos.txt")
					);
			
			// 위의 방법처럼 생성자에 바로 담은거랑
			// 생성자이름으로 만든 변수에 담는거랑 같음 
			OutputStream os = new FileOutputStream("C:\\Temp\\fos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			System.out.println("입력 대기중.....");
			
			String readData = "";
			while(true) {
				// 입력된 데이터를 한 라인(한줄) 씩 읽음.
				readData = br.readLine();
				// readData 문자열이 quit로 시작하는 문자열이면 true, 아니면 false 반환
				// startsWith : 매개변수로 전달된 문자열로 시작하면 true
				if(readData.startsWith("quit")) {
					break;
				}// end if
				
				writer.write(readData);
				
				// 줄바꿈
				writer.newLine();
				
			}// end while
			
			// 출력 스트림이니까 잔존 메모리 다 출력
			writer.flush();
			writer.close();
			// 보조 스트림 닫으면 기반 스트림도 닫임
			br.close();  //  System.in.close();
			
			
		}catch(IOException e) {
			
		}
		
		
		
	}// end main method

}// end StreamReaderWriterExample class
