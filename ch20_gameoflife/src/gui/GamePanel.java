package application;

import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 50; // 격자의 크기 설정
	private final static Color backgroundColor = Color.BLACK; // 배경색 검은색
	private final static Color gridColor = Color.GRAY; // 격자선색 회색

	private int topBottomMargin; // 위아래 마진
	private int leftRightMargin; // 왼쪽 오른쪽 마진

	public GamePanel() {
		setBackground(Color.BLUE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// 이 메소드는 자동으로 시작 및 수정시 자신의 모습을 그린다.
		Graphics2D g2 = (Graphics2D) g; // 2D그래픽을 사용하기 위해

		int width = getWidth(); // 가로길이
		int height = getHeight(); // 세로길이

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

		g2.setColor(backgroundColor); // 색 설정
		g2.fillRect(0, 0, width, height); // 사각형의 좌표에 색을 칠함

		drawGrid(g2, width, height);
		
		fillCell(g2, 0, 0, true);
		fillCell(g2, 0, 2, true);
		fillCell(g2, 3, 4, true);
	}

	private void fillCell(Graphics2D g2, int row, int col, boolean status) {
		// 사각형에 색을 넣는 메소드(그래픽, 가로 , 세로 ,상태(true면 녹색,false 배경색)
		Color color = status ? Color.GREEN : backgroundColor; //삼항연산자 status가 true면 녹색
		g2.setColor(color);
		
		int x = leftRightMargin + (col*CELLSIZE);
		int y = topBottomMargin + (row*CELLSIZE);
		
		g2.fillRect(x+1, y+1, CELLSIZE-1, CELLSIZE-1);
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		// 격자 줄을 긋는 메소드
		g2.setColor(gridColor);// 색설정 검정색

		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			// 줄을 긋는 메소드(x1,y1) (x2,y2)
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			// 줄을 긋는 메소드(x1,y1) (x2,y2)
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);

		}

	}
}
