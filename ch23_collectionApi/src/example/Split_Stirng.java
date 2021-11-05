package example;

public class Split_Stirng {

	public static void main(String[] args) {
		//문자열.split(" ") 문자열을 공백으로 쪼개서 배열로 리턴
		String text1 = "Hello; how are you? It is very windy/rainy today! George's feet are cold.";
		String text2 = "1안은 2050년 예상 순배출량이 2540만t으로 가장 높은데, 2018년 대비 96.3%가 줄어든다. 2050년까지 수명을 다하지 않은 석탄발전소 7기를 유지하되 석탄발전 비중을 현재의 41.9%에서 1.5%로, LNG발전 비중을 26.8%에서 8.0%으로 줄인다. 재생에너지를 5.6%에서 56.6%로, 연료전지를 0.3%에서 9.7%로 대폭 늘리는 안이다.";
//		String[] words = text1.split("[^a-zA-Z]+"); //정규표현식
		String[] words = text2.split("[^가-힣]+");
		
		for(var word: words) {
			if(word.length() < 2) {
				continue;
			}
			
			System.out.println(word.toLowerCase());
		}
		
	}

}
