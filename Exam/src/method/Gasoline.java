package method;

public class Gasoline {

	public static void main(String[] args) {
		//182.736/8.86
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calcEffiency(gasoline, distance);
		System.out.printf("����: %.2f km/L", efficiency);

	}
	public static double calcEffiency(double fuel, double distance) {
		return distance/fuel;
	}
}
