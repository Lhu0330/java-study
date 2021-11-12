package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Probability {

	Random r = new Random();
	Random r2 = new Random();
	double n = 0.75;
	List<String> t1 = new ArrayList<>();
	List<String> t2 = new ArrayList<>();
	List<String> t3 = new ArrayList<>();
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	
	private String i = "약자무시 정기흡수 에테르포식자 안정된상태 원한 슈퍼차지 굳은의지 구슬동자 위기모면 예리한둔기 급소타격 최대마나증가 마나효율증가 탈출의명수 결투의대가 불굴 분쇄의주먹 실드관통 달인의저력 여신의가호 중갑착용 폭발물전문가 강화방패 강령술 선수필승 부러진뼈 번개의분노 저주받은인형 승부사 기습의대가 마나의흐름 바리케이드 돌격대장 각성 질량증가 추진력 타격의대가 시선집중 아드레날린 속전속결 전문의 긴급구조 정밀단도";
	private String i2 = "공격력감소 방어력감소 공격속도감소 이동속도감소";
	private String[] l = i.split(" ");
	private String[] l2 = i2.split(" ");
	
	private String sel1 = l[r.nextInt(l.length)];
	private String sel2 = l[r2.nextInt(l.length)];
	private String sel3 = l2[r.nextInt(l2.length)];
	
	
	
	public void q1() {
		
		double num = r.nextDouble();
		if (num <= n) {
			t1.add(" o");
			if (n <= 0.26) {
			} else {
				n = n - 0.1;
			}
		} else {
			t1.add(" x");
			if (n >= 0.74) {

			} else {
				n = n + 0.1;
			}
		}
		c1++;
	}

	public void q2() {
		double num = r.nextDouble();
		if (num <= n) {
			t2.add(" o");
			if (n <= 0.26) {
			} else {
				n = n - 0.1;
			}
		} else {
			t2.add(" x");
			if (n >= 0.74) {

			} else {
				n = n + 0.1;
			}
		}
		c2++;
	}

	public void q3() {
		double num = r.nextDouble();
		if (num <= n) {
			t3.add(" o");
			if (n <= 0.26) {
			} else {
				n = n - 0.1;
			}
		} else {
			t3.add(" x");
			if (n >= 0.74) {

			} else {
				n = n + 0.1;
			}
		}
		c3++;
	}

	public void display() {
		
		boolean a = true;
		
		do {
			if (sel1.equals(sel2)) {
				sel1 = l[r.nextInt(l.length)];
				sel2 = l[r2.nextInt(l.length)];
			} else {
				a = false;
			}				
		}while(a);
		
	
		System.out.println(sel1);
		t1.forEach(t -> {
			System.out.print(t);
		});
		
		int f1 = Collections.frequency(t1, " o");
		System.out.print(" 성공횟수: " + Integer.toString(f1)+ "회");
		System.out.println();
		
		System.out.println();
		System.out.println(sel2);
		t2.forEach(t -> {
			System.out.print(t);
		});
		
		int f2 = Collections.frequency(t2, " o");
		System.out.print(" 성공횟수: " + Integer.toString(f2)+ "회");
		
		System.out.println();
		
		System.out.println();
		
		System.out.println(sel3);
		t3.forEach(t -> {
			System.out.print(t);
		});
		
		int f3 = Collections.frequency(t3, " o");
		System.out.print(" 성공횟수: " + Integer.toString(f3)+ "회");
		System.out.println();
		
		
		System.out.printf("현재 확률은 %.0f%%입니다.", n*100);
		System.out.println();
		
		
	}

	

	public void clear() {
		t1.clear();
		t2.clear();
		t3.clear();
		c1 = 0;
		c2 = 0;
		c3 = 0;
		n = 0.75;
	}
	
	

}
