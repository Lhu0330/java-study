package operators;

public class Xor_not {

	public static void main(String[] args) {
		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 ^ value2;
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1)); //xor결과
		
		System.out.println();
		
		System.out.println(toBinary(~result1)); //not 결과
	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" " , "0");
	}
}