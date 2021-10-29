package wirting_linebyline;

import java.io.File;

public class App2 {

	public static void main(String[] args) {
		
		String fileLocation = "C:\\Java\\java-study\\ch21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());

	}

}
