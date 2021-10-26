package staticmethod;

public class Cat {
	private String name;
	public static final String FOOD = "고야이 사료";
	private int id;
	private static int count = 0;

	public Cat(String name) { // 생성자는 리턴 타입이 없음(일반메소드랑 다름)
		this.name = name;
		count++;
		id = count;
	}

	@Override
	public String toString() {
		return "고양이 [id=" + id + ", name=" + name + "]";

	}

	public static int getCount() { // 스테틱메소드
//		String n = name;
//		스테틱 메소드는 인스턴스 변수 사용 불가
		return count;
	}
}
