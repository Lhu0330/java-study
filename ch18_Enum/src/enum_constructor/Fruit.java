package enum_constructor;

public enum Fruit {
	APPLE("초록색"), BANANA("노란색"), ORANGE("오렌지색");
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
		}
	public String toString() {
		return super.toString().toLowerCase() + " (" + color+")";
	}
}
