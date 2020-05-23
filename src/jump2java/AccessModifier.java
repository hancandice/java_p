package jump2java;

public class AccessModifier {
	private String secret;
	private String getSecret() {
		return this.secret;
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.secret = "plastic surgery";
		System.out.println(am.getSecret());
		
	}
}
		
// 접근제어자가 private으로 설정되었다면 private이 붙은 변수, 메소드는 *해당 클래스에서만* 접근이 가능하다. 
