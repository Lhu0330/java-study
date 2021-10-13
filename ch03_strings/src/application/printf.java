package application;

public class printf {

	public static void main(String[] args) {
		// printf("출력서식(%d,%f,%c,%s)",출력할값)
		int age=25;
		String addr="부산";
		
		System.out.printf("내 나이는 %d살 입니다. \n", age);
		System.out.printf("내 나이는 %d살 이고 %s에 살고 있습니다.. \n", age,addr);
		
		double pi = 3.141592;
		System.out.printf("파이의 값은 : %.2f",pi);//소수점 2자리
	}

}
