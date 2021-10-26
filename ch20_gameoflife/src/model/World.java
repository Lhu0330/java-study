package model;
//셀의 상태를 저장하는 객체
public class World {
	private int rows;
	private int columns;
	
	private boolean[][] grid; //불린 이중 배열
	
	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns]; //여중배열 객체 만들기( 크기 설정)
	}
	
	public boolean getCell(int row, int col) {
		return grid[row][col]; //월드의 grid에서 현재 셀(사각형)이 녹색인지 검은색인지?
	}
	
	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status; // 셀의 상태를 설정(셋)
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

		
}



