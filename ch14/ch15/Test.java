package ch15;

public class Test {
	public static void main(String[] args) {
		String data  = "aaa;1234";
		int idx = data.indexOf(';');
		String cmd = data.substring(0,idx);//aaa
		data = data.substring(idx);//1234
		System.out.println(cmd);
		System.out.println(data);
	}
}
