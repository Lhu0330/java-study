package method;

public class Twelveanimal {

	public static void printAnimal(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0: 
			animal = "¿ø¼þÀÌ";
			break;
		case 1: 
			animal = "´ß";
			break;
		case 2: 
			animal = "°³";
			break;
		case 3: 
			animal = "µÅÁö";
			break;
		case 4: 
			animal = "Áã";
			break;
		case 5: 
			animal = "¼Ò";
			break;
		case 6: 
			animal = "È£¶ûÀÌ";
			break;
		case 7: 
			animal = "Åä³¢";
			break;
		case 8: 
			animal = "¿ë";
			break;
		case 9: 
			animal = "¹ì";
			break;
		case 10: 
			animal = "¸»";
			break;
		case 11: 
			animal = "¾ç";
			break;
		default: 
			animal = "ERROR!";
			break;
		}
		System.out.printf("%d³â => %s¶ì\n", birthYear, animal);
	}
	
	public static void main(String[] args) {
		printAnimal(1986);
		printAnimal(1990);
		printAnimal(2000);

	}

}
