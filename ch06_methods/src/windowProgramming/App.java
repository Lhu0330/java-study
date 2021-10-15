package windowProgramming;

public class App {

	public static void main(String[] args) {
		window win = new window();
		win.setWidth(400);
		win.setIsvisible(true);
		
		System.out.println("창의 가로 길이: " + win.getWidth());
		System.out.println("보이는가? " + win.getIsvisible());
		

	}

}
