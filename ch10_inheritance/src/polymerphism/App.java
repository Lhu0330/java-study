package polymerphism;

public class App {

	public static void main(String[] args) {
		
//		Cat cat1 = new Housecat();
//		cat1.vocal();
//		cat1.hunt();
//		
//		Cat cat2 = new Roadcat();
//		cat2.vocal();
//		cat2.hunt();
//		
//		Cat cat3 = new Tiger();
//		cat3.vocal();
//		cat3.hunt();
//		
		Cat[] cats = { new Housecat(), new Roadcat(), new Tiger() };
//		cats[0].vocal();
//		cats[0].hunt();
//		
//		cats[1].vocal();
//		cats[1].hunt();
//		
//		cats[2].vocal();
//		cats[2].hunt();
		
		for (int i = 0 ; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}

		//����ȯ casting
		//�⺻Ÿ��
		//int a =1.2345;
		int b =(int)1.2345;
		System.out.println(b);
		
		//����Ÿ��: �⺻�� ������ Ŭ���� Ÿ�� ��
		Cat cat1 = new Housecat(); //��ĳ����
		
		Housecat cat2 = (Housecat)cat1; // �ٿ�ĳ����(����Ŭ������ ��ȯ)
		
	}

}