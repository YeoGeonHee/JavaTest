package chapter15;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		
		int var_byte = -1;
		System.out.print("문자입력 >>");
		do {
			try {
				var_byte =System.in.read();
			} catch (IOException e ) {
				e.printStackTrace();				
			}
			if(var_byte == 10 || var_byte == 13) { 
				break;
			}else {
				System.out.println("읽은 값 : " + (char)var_byte);
			}
		}
		while(true);
		System.out.println("end");
		}
	}

