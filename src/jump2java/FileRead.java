package jump2java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/candicehan/out.txt"));
		while(true) {
		    String line = br.readLine();
		    if (line==null) break;
		    // BufferedReader의 readLine 메소드는 더 이상 읽을 라인이 없을 경우 null을 리턴한다. 
		    System.out.println(line);
		}
//		byte[] b = new byte[1024];
//		FileInputStream input = new FileInputStream("/Users/candicehan/out.txt");
//		input.read(b);
//	    System.out.println(new String(b));
//	    input.close();
		br.close();
	}
	
}
// FileInputStream 대신 FileReader와 BufferedReader의 조합을 사용하면 라인 단위로 파일을 읽을 수 있다. 