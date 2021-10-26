package custom_exception;

import custom_exception.exception.TempTooHighException;

public class App {

	public static void main(String[] args) {

	Thermostat stat = new Thermostat();
	
	try {
		stat.setTemperature(40);
	} catch (TempTooHighException e) {
		//온도가 낮을 경우 처리 코드
		System.out.println(e.getMessage());
	} catch (TempTooLowException e) {
		//온도가 높을 경우 처리코드
		System.out.println(e.getMessage());
	}

	}

}
