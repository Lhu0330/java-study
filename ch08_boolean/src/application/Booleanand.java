package application;

public class Booleanand {

	public static void main(String[] args) {
		// ==, !=, !(�ݴ�) , &&(and), ||(or)
		
		boolean isRaining = false;
		boolean haveUmbrella = true;
		boolean takeUmbrella = false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
			
		}
		
		System.out.println("ù��° ���: "+ takeUmbrella);
		
		//and ������ &&
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		System.out.println("�ι�° ���: "+ takeUmbrella);
		
		//�������� ������
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("����° ���: "+ takeUmbrella);

		
		
	}
	

}
