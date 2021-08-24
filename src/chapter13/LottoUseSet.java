package chapter13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoUseSet {

	public static void main(String[] args) {

        Random n = new Random();

        // 중복값 불가, 순서 없음
        Set lotto = new HashSet(); 
        while(true) {
            int b = n.nextInt(45)+1;
            lotto.add(b);
            if(lotto.size() == 6) break;
        }

        System.out.println(lotto);

        // 중복값 불가, 값 크기 기억 정렬됨
        Set lotto2 = new TreeSet();
        while(true) {
            int b = n.nextInt(45)+1;
            lotto2.add(b);
            if(lotto2.size() == 6) break;
        }

        System.out.println(lotto2);
    }

}