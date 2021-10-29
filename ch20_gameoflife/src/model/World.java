package model;

import java.util.Random;

//셀의 상태를 저장하는 객체
public class World {
	private int rows;
	private int columns;

	private boolean[][] grid; // 불린 이중 배열
	private boolean[][] buffer; //버퍼 임시 배열
	
	private int countNeighbours(int row, int col) {

		int n = 0;

		for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
			for (int colOffset = -1; colOffset <= 1; colOffset++) {

				if (rowOffset == 0 && colOffset == 0) {
					continue; // 아래 갯수는 세지 않고 다시 다시 반복한다.
				}

				int gridRow = row + rowOffset;
				int gridCol = col + colOffset;

				if (gridRow < 0) {
					continue;
				} else if (gridRow == rows) {
					continue;
				}

				if (gridCol < 0) {
					continue;
				} else if (gridCol == columns) {
					continue;
				}

				boolean status = getCell(gridRow, gridCol);

				if (status) {
					n++; // 주변에 생성된 녹색셀을 센다.
				}

			}
		}

		return n;
	}

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns]; // 여중배열 객체 만들기( 크기 설정)
		buffer = new boolean[rows][columns];
	}

	public boolean getCell(int row, int col) {
		return grid[row][col]; // 월드의 grid에서 현재 셀(사각형)이 녹색인지 검은색인지?
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

	public void randomize() {
		// 그리드 배열에 랜덤으로 true false 넣기
		Random random = new Random();

		for (int i = 0; i < (rows * columns) / 10; i++) {
			int row = random.nextInt(rows); // 랜덤으로 0 부터 rows(전체줄수)-1까지 랜덤 생성
			int col = random.nextInt(columns); // 0~colunms-1
			setCell(row, col, true); // 랜덤으로 걸린 셀을 녹색으로
		}
	}

	public void clear() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				setCell(row, col, false); // 모든셀을 false로 한다
			}
		}
	}

	public void next() {
		// 모든 그리드(row,col)이 출력되도록 next메소드 작성
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
//				System.out.println("("+row +", " + col+ ")");
				int neighbours = countNeighbours(row, col);
//				System.out.printf("(%d, %d) %d\n", row, col, neighbours);
				/* 알고리즘
				 * 1. 주변 녹색개수 < 2 or >3 는 검은색
				 * 2. 녹색개수 == 3 일때 녹색
				 * 3. 녹색개수 == 2 일때 그대로
				 */
				boolean status = false;
				
				if (neighbours < 2) {
					status = false;
				} else if (neighbours > 3) {
					status = false;
				} else if (neighbours == 3) {
					status = true;
				} else if (neighbours == 2) {
					status = getCell(row, col);
				}
				
				buffer[row][col] = status;//임시 배열 버퍼에 입력한다.
				
			}
		}
		
		for (int row = 0; row<rows; row++) {
			for (int col = 0; col < columns; col++) {
				grid[row][col] = buffer[row][col];
			}
		}

	}

}
