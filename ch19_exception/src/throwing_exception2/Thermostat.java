package throwing_exception2;

public class Thermostat {
	
	public void setTemperature(double temperature) throws Exception {
		
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ����: "+temperature);//�µ��� ������ ��� ���
	}
	
	public void setMachineTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			//�µ����� ���������� ���ܼ� ����ó���Ѵ�. threow�� �ϴ� ���ܸ� ���߿� ó��
			throw new Exception("�µ��� ������ �Դϴ�."); 
			
			//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���Ҷ� ó���ؾ� �Ѵ�. 
			//try-catch�� �ٷ� ó��, throw�� �ѱ�
			
		}
	}

}
