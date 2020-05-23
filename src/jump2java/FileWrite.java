package jump2java;

import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
	    PrintWriter pw = new PrintWriter("/Users/candicehan/out.txt");
	    for(int i=1; i<=25; i++) {
	    	String data = i+" 번째 줄입니다.";
	        pw.println(data);
	    }
	    pw.close();
	}
}

/* FileOutputStream에 값을 쓸 때는 byte배열로 써야 하므로 
String을 byte배열로 바꾸어주는 getBytes method를 이용해야 한다. 

FileWriter를 이용하면 byte 배열 대신 문자열을 직접 파일에 쓸 수가 있다.

PrintWriter를 이용하면 \r\n 을 덧붙이는 대신 println 이라는 method를 사용할 수 있게 된다. 
*/