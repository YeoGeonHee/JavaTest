package chapter15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {

	/**
     * 주소 정보 출력하기
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream fi = null;
        InputStreamReader isr = null;
        BufferedReader bfr = null;
        StringTokenizer st = null;

        try{
            fi = new FileInputStream("address.txt");
            isr = new InputStreamReader(fi); // InputStream -> Reader
            bfr = new BufferedReader(isr);

            String str = null;
            while((str = bfr.readLine()) != null){
                st = new StringTokenizer(str, ",");
                System.out.println("이름 : " + st.nextToken() + ",주소 : " + st.nextToken()
                        + ",이메일 : " + st.nextToken() + ",전화번호 : " + st.nextToken());
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
