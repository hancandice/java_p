package jump2java;

public class Test {
	int a;
	
	public void vartest2() {
		this.a++;
	}
	
	public static void main(String[] args) {
		Test myTest = new Test();
		myTest.a = 1;
		myTest.vartest2();
	    System.out.println(myTest.a);
	}
}
