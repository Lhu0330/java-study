package method;

public class Audition {

	public static String test(double vocal, double dance) {
		return vocal*dance >= 70.0 ? "�հ�" : "���հ�" ;
	}
	
	public static void main(String[] args) {
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		//��� ���
		System.out.printf("Tom�� ����� ���: %s\n", test(tomVocal, tomDance));
		System.out.printf("kate�� ����� ���: %s\n", test(kateVocal, kateDance));
		

	}

}