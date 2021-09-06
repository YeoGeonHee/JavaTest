package memberArrayList;

import java.util.List;
import java.util.Scanner;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {
		List<MemberVo> members = MemberMain.members;
		System.out.printf("======= Member List %s명 ========\n",members.size());
		for(int i=0;i<members.size();i++) {
			System.out.print("ID: " + members.get(i).getId() + " / ");
			System.out.print("PW: " + members.get(i).getPw() + " / ");
			System.out.print("NAME: " + members.get(i).getName() + " / ");
			System.out.print("AGE: " + members.get(i).getAge() + " / ");
			System.out.println();
		}
		System.out.printf("======= Member List %s명 ========\n",members.size());
		for(MemberVo m: members) {
			System.out.print("ID: " + m.getId() + " / ");
			System.out.print("PW: " + m.getPw() + " / ");
			System.out.print("NAME: " + m.getName() + " / ");
			System.out.print("AGE: " + m.getAge() + " / ");
			System.out.println();
		}
	}

}
