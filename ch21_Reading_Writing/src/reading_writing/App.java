package reading_writing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		File currentDirectory = new File(".");
		
		System.out.println(currentDirectory.getCanonicalPath());
		
		for (String f : currentDirectory.list()) {
			System.out.println(f);
		}
		//텍스트 파일 쓰기
		String text = "hellow! \n how are you?";
		
		Path path = Paths.get("text.txt");
		Files.write(path, text.getBytes());
		
		// 파일읽기
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
	}
	

}
