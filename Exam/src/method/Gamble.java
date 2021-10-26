package method;


public class Gamble {
	
	public static int dice() {
		int result = 0;
		do {
			
			double a = Math.random();
			if((0.1 <= a) && (a < 0.2)) {
				result=1;
				break;
			}
			if((0.2 <= a) && (a < 0.3)) {
				result=2;
				break;
			}
			if((0.3 <= a) && (a < 0.4)) {
				result=3;
				break;
			}
			if((0.4 <= a) && (a < 0.5)) {
				result=4;
				break;
			}
			if((0.5 <= a) && (a < 0.6)) {
				result=5;
				break;
			}
			if((0.6 <= a) && (a < 0.7)) {
				result=6;
				break;
			}
			if((0.7 <= a) || (a < 0.1)) {
				result=7;
			}
		} while(result!=6);
		return result;
	}
	

	
	public static double exchange(double dollar) {
		return dollar*1082.25108;
	}
	
	public static void main(String[] args) {
		// random 1~6 3번 눈값 더하고 *1082.25108
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득금액: $%.2f(%.0f원)", dollar, won);
		
	}

}
