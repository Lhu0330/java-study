package game.object;

public enum Gameobject {
	
	����, ����, ��;

	private int[][] comparison = {
			//      ���� ���� ��
			/*����*/ {0, -1, 1},
			/*����*/ {1, 0, -1},
			/*��*/  {-1, 1, 0},
	};
	
	public int compareto(Gameobject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
	}

}
