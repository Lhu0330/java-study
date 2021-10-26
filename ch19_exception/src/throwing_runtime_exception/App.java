package throwing_runtime_exception;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(50);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
