package staticmethod;

public class App {
	
	private static int add(int a, int b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		// ����ƽ �޼ҵ� getCount ���
		final String CAT_COUNT = "����� ����: %d\n";
		
		Cat cat1 = new Cat("��ƿ��");
		Cat cat2 = new Cat("���̾�");
		Cat cat3 = new Cat("�����");
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());
		
		//string.format�� printf�� ���ڿ��� ǥ�� ����
		String catCount = String.format(CAT_COUNT, Cat.getCount());
		System.out.println(catCount);

		
		int x = add(1,1);
		System.out.println(x);

	}

}
