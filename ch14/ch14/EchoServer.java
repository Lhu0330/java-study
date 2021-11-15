package ch14;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		try {
			int cnt = 0; //client�� ���Ӱ���
			ServerSocket server = new ServerSocket(8000);
			System.out.println("ServerSocket Start.........");
			while(true) {
				Socket sock = server.accept();//wait
				
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Ŭ���̾�Ʈ ����� thread�� ������ �Ѵ�.(����Ŭ����)
	
	class EchoThread extends Thread{
		@Override
		public void run() {
			
		}
	}
	
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
