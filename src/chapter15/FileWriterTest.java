package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter 테스트 입니다.";
		
		try {
			fw = new FileWriter("writer_sample",true);
			fw.write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
