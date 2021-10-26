package game.object;

public enum Gameobject {
	
	가위, 바위, 보;

	private int[][] comparison = {
			//      가위 바위 보
			/*가위*/ {0, -1, 1},
			/*바위*/ {1, 0, -1},
			/*보*/  {-1, 1, 0},
	};
	
	public int compareto(Gameobject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
	}

}
