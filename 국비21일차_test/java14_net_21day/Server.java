package java14_net_21day;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		ServerSocket serv = null;
		Socket sock = null;
		File file = new File("./src/java14_net_21day/receive.txt");
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		byte [] buf = new byte[1024];
		int port = 10000;
		int len = -1;

		try {
			serv = new ServerSocket(port);
			while(true) {
				System.out.println("======Listening . . . . . . . . .");
				sock = serv.accept();
				
				in = new BufferedInputStream(sock.getInputStream());
				out = new BufferedOutputStream(new FileOutputStream(file));
				
				System.out.println("\n 데이터 송신 중 . . . . . . . . . .");
				while((len = in.read(buf)) != -1) {
					out.write(buf, 0, len);
					out.flush();
				}
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
