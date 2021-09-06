package memberFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {
		
		FileReader fr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try {
            fr = new FileReader("members.txt");
            bfr = new BufferedReader(fr);
            String member = "";
            while((member = bfr.readLine()) != null){
                st = new StringTokenizer(member, ",");
                String fm = "ID : %s, PW : %s, Name : %s, Age : %s %n";
                System.out.printf(fm, st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}