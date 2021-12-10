package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {

	public EchoServer2() {
		try {
			int cnt = 0; //client�� ���Ӱ���
			ServerSocket server = new ServerSocket(8000);
			System.out.println("ServerSocket Start.........");
			while(true) {
				Socket sock = server.accept();//wait
				EchoThread et = new EchoThread(sock);
				et.start();//결론적으로 run 메소드 호출
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Ŭ���̾�Ʈ ����� thread�� ������ �Ѵ�.(����Ŭ����)
	
	class EchoThread extends Thread{
		
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(
							sock.getInputStream()));
				out = new PrintWriter(
						sock.getOutputStream(),true/*auto flush*/);
						
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		@Override
		public void run() {
			try {
				//client가 접속하면 처음으로 받는 메세지
				out.println("Hello Enter BYB to exit");
				while(true ) {
					//client가 메세지 모낼때 가지 대기
					String line = in.readLine();
					if(line==null) {//Client접속을 끊을때
						break;//while문 탈출
						
					} else {
						//client에서 온 메세지 앞에 echo 붙혀서 반사
						out.println("Echo: " + line);
						if(line.equalsIgnoreCase("BYB")) {
							break;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new EchoServer2();
	}

}
