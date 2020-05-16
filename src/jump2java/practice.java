package jump2java;

public class practice {
	public static void main(String[] args) {
		int[] marks = {90, 25, 67, 45, 80};
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] < 60) {
		    	continue;
		    }
		    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}
    }
}