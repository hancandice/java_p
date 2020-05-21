package jump2java;

public interface BarkablePredator extends Predator, Barkable {
	
}

/* 인터페이스는 일반 클래스와 달리 extends 를 이용하여 여러개의 인터페이스(Predator, Barkable)를 
동시에 상속할 수 있다. 즉, 다중 상속이 지원된다. (일반 클래스는 단일 상속만 가능하다.) */
