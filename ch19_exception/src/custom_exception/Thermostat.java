package custom_exception;

import custom_exception.exception.*;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempOutOfRangeException {
		
		if(temperature < 0 || temperature > 35) {
			//�µ����� ���������� ���ܼ� ����ó���Ѵ�. threow�� �ϴ� ���ܸ� ���߿� ó��
			throw new Exception("�µ��� ������ �Դϴ�."); 
			
			//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���Ҷ� ó���ؾ� �Ѵ�. 
			//try-catch�� �ٷ� ó��, throw�� �ѱ�
			
		}
		System.out.println("�µ� ����: "+temperature);//�µ��� ������ ��� ���
	}

}
