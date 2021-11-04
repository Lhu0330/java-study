package operators;

public class And_Or {

	public static void main(String[] args) {
		
//		System.out.println(toBinary(15));
//		System.out.println(toBinary(255));
		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 & value2;
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1));
		
		int result2 = value1 | value2;
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result2));
		

	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" " , "0");
	}

}


