package windowProgramming;

public class App {

	public static void main(String[] args) {
		window win = new window();
		win.setWidth(400);
		win.setIsvisible(true);
		
		System.out.println("â�� ���� ����: " + win.getWidth());
		System.out.println("���̴°�? " + win.getIsvisible());
		

	}

}
