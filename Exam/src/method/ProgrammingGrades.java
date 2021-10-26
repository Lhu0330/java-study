package method;

public class ProgrammingGrades {

	public static void main(String[] args) {
		int score1= 96;
		int score2= 85;
		int score3= 76;
		
		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score2, grade(score2));
		System.out.printf("%d점 -> %s\n", score3, grade(score3));
		
	}
	
	public static  String grade(int score) {
		String a = "C+";
		if(score >= 95)	a="A+";
		else if(score >= 90)	a="A";
		else if(score >= 80)	a="B+";
		else if(score >= 70)	a="B0";
		else a="C+";
		return a;
	}

}
