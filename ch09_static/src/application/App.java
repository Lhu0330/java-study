package application;

public class App {

	public static void main(String[] args) {
		// ����� Ŭ���� �ҷ�����
		Cat cat1 = new Cat("��ƿ��");
		Cat cat2 = new Cat("���̾�");
		Cat cat3 = new Cat("�����");
		
		System.out.println(cat1);
		System.out.println(cat2.toString());
		
		//����ƽ ������ ��ü�� ������� Ŭ������.������ ����Ѵ� ��ü ������ �ʿ䰡 ����
		System.out.println(Cat.FOOD);
		System.out.println(Cat.getCount());
	}	

}
