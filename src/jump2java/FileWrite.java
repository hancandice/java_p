package jump2java;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
//	    FileWriter fw = new FileWriter("/Users/candicehan/out.txt");
		PrintWriter pw = new PrintWriter("/Users/candicehan/out.txt");
	    for(int i=1; i<11; i++) {
	    	String data = "#"+i+" 번째 줄입니다.";
	    	pw.println(data);
	    }
	    pw.close();
	    
	    PrintWriter pw2 = new PrintWriter(new FileWriter("/Users/candicehan/out.txt", true)); 
	    // boolean 입력 파라미터는 파일을 추가모드(append)로 열 것인지에 대한 구분값이다.
	    for(int i=11; i<21; i++) {
	    	String data = "##"+i+" 번째 줄입니다.";
	    	pw2.println(data);
	    }
	    pw2.close();
	}   
}

/* FileOutputStream에 값을 쓸 때는 byte배열로 써야 하므로 
String을 byte배열로 바꾸어주는 getBytes method를 이용해야 한다. 

FileWriter를 이용하면 byte 배열 대신 문자열을 직접 파일에 쓸 수가 있다.

PrintWriter를 이용하면 \r\n 을 덧붙이는 대신 println 이라는 method를 사용할 수 있게 된다. 

PrintWriter의 생성자의 입력으로 파일명 대신 추가모드로 열린 FileWriter의 객체를 사용하면 된다. 
*/