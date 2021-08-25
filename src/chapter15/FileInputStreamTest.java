package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream fIn=null;

        try{
            // 파일 있어야 함(프로젝트 ws 폴더)
            fIn = new FileInputStream("test.txt");

        }
        catch(IOException io){
            io.printStackTrace();
        }

        int var_read = -1;

        try{
            while((var_read = fIn.read()) != -1){
                System.out.print((char)var_read);
            }
        }
        catch(IOException io){
            io.printStackTrace();
        }
        finally{
            try{
                fIn.close();
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }
}