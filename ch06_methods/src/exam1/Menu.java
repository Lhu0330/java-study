package exam1;

public class Menu {
	
	String[] options = {"아이템 보기", "아이템주기", "아이템삭제", "종료"};
	
	void display() {
		System.out.println("메뉴를 선택: ");
		
		for(int i = 0; i<options.length;i++) {
			System.out.printf(" %d. %s\n", i, options[i]);
		}
	}
}
