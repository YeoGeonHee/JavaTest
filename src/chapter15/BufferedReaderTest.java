package chapter15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	/**
     * BufferedReader 테스트
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream fi = null;
        InputStreamReader isr = null;
        BufferedReader bfr = null;

        try{
            fi = new FileInputStream("sample.txt");
            isr = new InputStreamReader(fi); // InputStream -> Reader
            bfr = new BufferedReader(isr);

            String str = null;
            while((str = bfr.readLine()) != null){
                System.out.println(str);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                fi.close();
                isr.close();
                bfr.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

