package casting;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new Housecat();
		cat1.vocal();
		cat1.hunt();
		
		//cat1.call();
		//cat Ÿ���̱� ������ ����� �޼ҵ常 ��밡��(�������̵� ��)
		
		Housecat cat2 = (Housecat)cat1;
		cat2.call();
		
	}

}
