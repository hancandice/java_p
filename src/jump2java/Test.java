package jump2java;

public class Test {
	public void vartest (int x) {
		x++;
	}
	
	public static void main (String[] args) {
		int a = 1;
		Test myTest = new Test();
		myTest.vartest(a);
		System.out.println(a);
	}
}
