package interface_inheritance;

public class Machine implements Defaultrunnable{
	
	@Override
	public void run() {
		System.out.println("�ӽ� ����!");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("ǥ���� ������ ����");
	}
}
