package chapter07;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int idx = 0;
		
		while(true) {
			//번호 생성
			int number = (int)(Math.random()*45)+1;
			
			//중복 번호 체크
			boolean insert = true;
			for (int i=0; i<=idx; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			// 중복이 없으면 번호 입력
			if(insert == true) {
				lotto[idx] = number;
				idx++;
			}
			//번호 6개 되면 멈춤
			if (idx == 6) break;
		}
		for (int i=0; i<lotto.length; i++) {
            System.out.println(lotto[i]);
        }

}
	}
