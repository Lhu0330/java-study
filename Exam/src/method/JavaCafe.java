package method;

public class JavaCafe {

	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}
	
	//시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) {
		double pay = 0.0;
		
		//근무시간 * 기본시급 주당 근무가 40이상이면 1.5배 지급 최저시급이 8이하면 경고문 주간 근무가 60시간이 넘으면 경고문
		if(basePay >= 8.0) {
			if(hours <= 40) {
				pay = basePay * hours;
				System.out.printf("$%.2f\n", pay);
			} else if (40 < hours && hours <=60) {
				pay = (basePay*40) + (basePay*1.5*(hours - 40));
				System.out.printf("$%.2f\n", pay);
			} else {
				System.out.println("초과 근무시간 에러!");
			}
			
		} else {
			System.out.println("최저 시급 에러!");
		}
		
	}
}
