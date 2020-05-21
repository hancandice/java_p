package jump2java;

public class Bouncer {
	public void barkAnimal(Barkable animal) {
	    animal.bark();
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}

/* 자식 클래스에 의해 만들어진 객체는 언제나 부모 클래스의 자료형으로 사용할 수 있다.
다음과 같은 코딩이 가능하다. 
Animal tiger = new Tiger();
Animal lion = new Lion(); 

# 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 객체지향 세계에서는 
다형성, 폴리모피즘(Polymorphism)이라고 부른다. */