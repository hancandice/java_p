package jump2java;

// 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다. 
//
//class Singleton {
//	private Singleton() {
//		
//	}
//	
//	public static Singleton getInstance() {
//		return new Singleton();
//	}
//}
//
//public class SingletonTest {
//	public static void main(String[] args) {
//		Singleton singleton = Singleton.getInstance();
//	}
//}


class Singleton {
	private static Singleton one;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton();
		}
		return one;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}