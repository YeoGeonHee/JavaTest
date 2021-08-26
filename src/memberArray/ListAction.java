package memberArray;

import java.util.Scanner;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {
		MemberVo[] members = MemberMain.members;
		System.out.printf("======= Member List %s명 ========\n",members.length);
		for(int i=0;i<members.length;i++) {
			System.out.print("ID: " + members[i].getId() + " / ");
			System.out.print("PW: " + members[i].getPw() + " / ");
			System.out.print("NAME: " + members[i].getName() + " / ");
			System.out.print("AGE: " + members[i].getAge() + " / ");
			System.out.println();
		}
		System.out.printf("======= Member List %s명 ========\n",members.length);
		for(MemberVo m: members) {
			System.out.print("ID: " + m.getId() + " / ");
			System.out.print("PW: " + m.getPw() + " / ");
			System.out.print("NAME: " + m.getName() + " / ");
			System.out.print("AGE: " + m.getAge() + " / ");
			System.out.println();
		}
	}

}
