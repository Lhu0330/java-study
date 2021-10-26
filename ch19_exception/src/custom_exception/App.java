package custom_exception;

import custom_exception.exception.TempTooHighException;

public class App {

	public static void main(String[] args) {

	Thermostat stat = new Thermostat();
	
	try {
		stat.setTemperature(40);
	} catch (TempTooHighException e) {
		//�µ��� ���� ��� ó�� �ڵ�
		System.out.println(e.getMessage());
	} catch (TempTooLowException e) {
		//�µ��� ���� ��� ó���ڵ�
		System.out.println(e.getMessage());
	}

	}

}
