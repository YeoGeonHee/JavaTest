package chapter15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	/**
	     * FileRader 테스트
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        FileReader fr = null;

	        try{
	            fr = new FileReader("sample.txt");
	            int readChar=-1;
	            while((readChar=fr.read()) != -1){
	                System.out.print((char)readChar);
	            }
	        }
	        catch(IOException e){
	            e.printStackTrace();
	        }
	        finally{
	            try{
	                fr.close();
	            }
	            catch(IOException e){
	                e.printStackTrace();
	            }
	        }
	    }
	}
