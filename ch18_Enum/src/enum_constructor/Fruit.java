package enum_constructor;

public enum Fruit {
	APPLE("�ʷϻ�"), BANANA("�����"), ORANGE("��������");
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
		}
	public String toString() {
		return super.toString().toLowerCase() + " (" + color+")";
	}
}
