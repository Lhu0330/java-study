package staticmethod;

public class Cat {
	private String name;
	public static final String FOOD = "����� ���";
	private int id;
	private static int count = 0;

	public Cat(String name) { // �����ڴ� ���� Ÿ���� ����(�Ϲݸ޼ҵ�� �ٸ�)
		this.name = name;
		count++;
		id = count;
	}

	@Override
	public String toString() {
		return "����� [id=" + id + ", name=" + name + "]";

	}

	public static int getCount() { // ����ƽ�޼ҵ�
//		String n = name;
//		����ƽ �޼ҵ�� �ν��Ͻ� ���� ��� �Ұ�
		return count;
	}
}
