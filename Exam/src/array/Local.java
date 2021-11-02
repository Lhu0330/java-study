package array;

public class Local {

	public static void main(String[] args) {
		//배열생성
		String [] cities = {"서울" , "부산", "인천", "대전", "대군"};
		int [] visitors = {599, 51, 46, 43, 27};
		
		for (int i=0; i< cities.length; i++) {
			System.out.println(cities[i] + ":" + visitors[i] + "명" );
		}

	}

}
