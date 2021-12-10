package ch14;

import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.attribute.AclEntry;

public class EchoServer {

	public EchoServer() {
		//java.io, java.net, java.sql거의 예외가능성이 있는 생성자, 메소드
		try {
			int port = 8000;
			int cnt = 0; //client의 접속 갯수
			ServerSocket server = new ServerSocket(port);
			System.out.println("ServerSocket Start......");
			while(true) {
				//client가 접속할땍가지 대기 상태
				Socket sock = sever.accept();
				
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//내부 클래스로 client의 대응을 각각 하기 위해 Thread 기능의 클래스 새성
	class EchoThread extends Thread {
		try {
			this.sock = sock;
		} catch(Exception e) 
	}
	
	@Override
	public void run() {
		
	}
	
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
