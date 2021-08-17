package chapter5;

public class IfEx {

	public static void main(String[] args) {
		
		int score = 90; // 스코어 변경시 합격,불합격 나옴
		
		System.out.println("시험 시작");
		if(score >= 60) {// 합격일때 합격으로 찍는 프로그램 , 불합격안나옴
			System.out.println("합격");
		}else { // 불합격나오게 하는 식
			System.out.println("불합격");
		}
		System.out.println("시험 끝");
		
		score = 80;
		String grade = "";
		System.out.println("시험 시작");
		if(score >= 95) {
			grade = "A+";
		}else if (score >= 90) {
			grade = "A";
		}else if (score >= 85) {
			grade = "B+";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
        System.out.println("학점부여 끝");  
	}

}
