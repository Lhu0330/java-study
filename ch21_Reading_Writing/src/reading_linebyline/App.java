package reading_linebyline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String fileLocation = "C:\\Java\\java-study\\ch21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))){
			br.write("오렌지");
			br.write("");
			br.write("애플");
			br.write("");
			br.write("바나나");
			br.write("");
			br.write("배");
			
		} catch (IOException e1) {
			System.out.println("파일을 쓸 수가 없음 : " + fileLocation);
		}
		
		System.out.println("파일 쓰기 완료 : " + fileLocation);
		
		
		
		
		
		
		
		//파일을 한줄씩 읽을 수 있는 클래스
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation));) {
			String line = null;
			while((line = reader.readLine()) != null) { //파일을 한줄씩 읽다가 마지막 글을 읽고나면 종료
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			//파일이 파일주소에 없을때
			System.out.println("파일을 찾지 못함 : " + fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		} 
		
				
	}

}
