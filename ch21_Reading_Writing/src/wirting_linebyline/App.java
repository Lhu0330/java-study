package wirting_linebyline;

import java.io.File;

public class App {

	public static void main(String[] args) {
		File currentDirectory = new File("src");
		
		System.out.println(currentDirectory.getAbsolutePath()); //절대경로(현재프로젝트폴더)
		
		//폴더안의 내부 파일들의 이름 출력
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
	}

}
