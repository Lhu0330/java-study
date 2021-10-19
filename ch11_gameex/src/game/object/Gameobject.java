package game.object;

public class Gameobject {
	private int id; // 가위바위보를 위한 id
	private String name; // 이름

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}

	private int[][] comparison = {
			//      가위 바위 보
			/*가위*/ {0, -1, 1},
			/*바위*/ {1, 0, -1},
			/*보*/  {-1, 1, 0},
	};
	
	public int compareto(Gameobject ob) {
		return comparison[id][ob.id];
	}

}
