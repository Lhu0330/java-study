package application;

public class Booleanor {
	public static void main(String[] args) {
		//|| or ������
		boolean isRaining = false;
		boolean mightRain = true;
		
		boolean haveUmbrella = true;
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����");
		
		}
		else {
			System.out.println("����� ���� �ʴ´�");
		}
		
		boolean rainCheck = isRaining || mightRain;
		
		if(rainCheck && haveUmbrella) {
			System.out.println("����� ����");
		
		}
		else {
			System.out.println("����� ���� �ʴ´�");
		}
		
	}

}
