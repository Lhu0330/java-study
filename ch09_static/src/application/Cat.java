package application;

public class Cat {
	private String name;
	public static final String FOOD = "����� ���";
	private static int count = 0;
	
	public Cat(String name) { //�����ڴ� ���� Ÿ���� ����(�Ϲݸ޼ҵ�� �ٸ�)
		this.name = name;
		count++;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
		
	}
	
	public static int getCount() { // ����ƽ�޼ҵ� 
//		String n = name;
//		����ƽ �޼ҵ�� �ν��Ͻ� ���� ��� �Ұ�
		return count;
	}
}
