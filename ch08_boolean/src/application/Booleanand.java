package application;

public class Booleanand {

	public static void main(String[] args) {
		// ==, !=, !(반대) , &&(and), ||(or)
		
		boolean isRaining = false;
		boolean haveUmbrella = true;
		boolean takeUmbrella = false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
			
		}
		
		System.out.println("첫번째 경우: "+ takeUmbrella);
		
		//and 연산자 &&
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		System.out.println("두번째 경우: "+ takeUmbrella);
		
		//삼항조건 연산자
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("세번째 경우: "+ takeUmbrella);

		
		
	}
	

}
