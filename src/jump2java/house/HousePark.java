package jump2java.house;

public class HousePark {
    String lastname = "park";
    protected String lastname1 = "han";
    public String info = "this is public message.";
    
    public static void main(String[] args) {
    	HouseKim kim = new HouseKim();
    	System.out.println(kim.lastname);
    }
}

/* HouseKim과 HousePark의 패키지는 jump2java.house로 동일하다. 
HouseKim 의 lastname 변수는 접근제어자가 default이므로 HousePark 클래스에서 main 메소드에서 사용한 것과 같이
kim.lastname 으로 HouseKim 의 lastname 변수에 접근이 가능하다. 

클래스 내의 클래스를 inner 클래스라고 부르는데 이러한 inner 클래스에도 역시 접근제어자를 붙여서 
접근을 제어할 수 있다. */

