package ch15;

import java.net.InetAddress;

public class InetAddressEx1 {
	public static void main(String[] args) {
		//java.net, java.io ??�?분의 ?��?��?�� �? 메소?�� ?��?��처리 
		try {
			//?��메인?���? ip 출력?��?�� ?��?��?��
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("로컬컴퓨?��?���? : " + add.getHostName());
			System.out.println("로컬컴퓨?��ip : " + add.getHostAddress());
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("?��?��: " + add.getHostAddress());
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			//배열 밑에 ?��?�� for문이 ?��?��.
			System.out.println("-------------------");
			System.out.println("?��?���?");
			for (int i = 0; i < adds.length; i++) {
				System.out.println(adds[i]);
			}
		} catch (Exception e) {
			//?��?��?�� ?��?��?��리까�? 출력?��?�� 메소?��
			e.printStackTrace();
		}
	}
}








