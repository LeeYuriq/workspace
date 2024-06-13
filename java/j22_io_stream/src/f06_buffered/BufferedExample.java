package f06_buffered;

// java.io에 있는 파일 쓸 때 마다 import하기 귀찮으니까 io패키지에 있는 것 다 사용할 수 있도록
import java.io.*;


public class BufferedExample {

	public static void main(String[] args) {

		String originalPath = "C:\\Temp\\bin.jpg";
		File file = new File(originalPath);
		System.out.println(file.exists()); // 파일 존재 여부
		System.out.println(file.length()); // 파일 크기(byte)
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			long startTime = 0, endTime = 0;
			
			FileOutputStream fos = new FileOutputStream("C:\\Temp\\dir\\copy.jpg");
		
			// 작업 시작전 시간 체크 
			startTime = System.nanoTime();
			
			int data;	// InputStream으로 읽은 바이트 데이터를 저장할 변수
			// EOF : 더 이상 읽을 파일이 없을 때 까지 while문 반복
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			// 출력 스트림은 잔존하는 데이터를 다 뺴줘야한다.
			fos.flush();
			
			// 자원 반납
			fos.close();
			fis.close();
			
			endTime = System.nanoTime();
			
			long result = (endTime - startTime);
			System.out.printf("fis fos file : %d ns %n", result);
			
			System.out.println("=============================================");
			
			InputStream is = new FileInputStream(originalPath);
			// 내부에 버퍼를 이용해서 파일의 입력 속도를 향상 시킨 보조 스트림
			//									 보조스트림(기반스트림)
			BufferedInputStream bis = new BufferedInputStream(is);
			
			OutputStream os = new FileOutputStream("C:\\Temp\\dir\\copyBis.jpg");
			// 내부에 버퍼 크기가 8192 byte
			//BufferedOutputStream bos = new BufferedOutputStream(os);
			// 읽어온 원본 이미지 크기 : 57456
			// 출력 버퍼 크기를 45000으로 지정
			//                                            (기반스트림, 메모리크기설정)
			// flush의 중요성
			BufferedOutputStream bos = new BufferedOutputStream(os, 45000);
			
			startTime = System.nanoTime();
			while((data = bis.read()) != -1) {
				bos.write(data);
			}

			/*
			bos.flush();
			// 보조 스트림 close() 호출 시 기반스트림 close() 호출
			bos.close();
			bis.close();
			*/
			
			endTime = System.nanoTime();
			result = (endTime - startTime);
			System.out.printf("buffered file : %d ns %n", result);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}// end main method

}// end BufferedExample class
