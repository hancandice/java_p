package jump2java.house.person;

import jump2java.house.HousePark;

public class JeeyoungHan extends HousePark {
	public static void main(String[] args) {
        JeeyoungHan jh = new JeeyoungHan();
        System.out.println(jh.lastname1);
	}
}

// HousePark 의 lastname1 변수가 protected 로 설정되었기 때문에 해당 클래스를 상속받은 외부 패키지 클래스에서 접근이 가능


