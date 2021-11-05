package lambda_return;

interface Joiner {
	String join(String t1, String t2);
}

public class App {

	public static void main(String[] args) {
		// 리턴 값이 있는 람다식
		Joiner joiner = (t1, t2) -> {
			String text = t1 + " - " + t2;
			return text;
		};

		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("학원", "공부"));

		Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;
		
		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));
	}
	


}
