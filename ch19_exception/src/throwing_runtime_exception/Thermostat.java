package throwing_runtime_exception;

public class Thermostat {
	
	public void setTemperature(double temperature) throws Exception {
		
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ����: "+temperature);//�µ��� ������ ��� ���
	}
	
	public void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			//�µ����� ���������� ���ܼ� ����ó���Ѵ�. threow�� �ϴ� ���ܸ� ���߿� ó��
			throw new RuntimeException("�µ��� ������ �Դϴ�."); 
			
			//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���Ҷ� ó���ؾ� �Ѵ�. 
			//try-catch�� �ٷ� ó��, throw�� �ѱ�
			
		}
	}

}
