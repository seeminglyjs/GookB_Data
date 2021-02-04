package java14_net_21day;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		Socket sock = null;
		File file = new File("./src/java14_net_21day/data.txt");
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		byte [] buf = new byte[1024];
		int len = -1;
		
		try {
			sock = new Socket("localhost", 10000);
			System.out.println("클라이언트 연결 완료 * * * * * * * * *");
			in = new BufferedInputStream(new FileInputStream(file));
			out = new BufferedOutputStream(sock.getOutputStream());
			while((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
				out.flush();
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
