package memberArray;

import java.util.Scanner;

public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		
		System.out.print("삭제할 ID : ");
		String id = sc.next();
		MemberVo member = null;
		MemberVo[] members = MemberMain.members;
		int deleteIndex = -1;
		for(int i=0;i<members.length;i++) {
			if(members[i].getId().equals(id)) {
				deleteIndex = i;
				break;
			}
		}
		
		if(deleteIndex != -1) {
			//delete
			MemberVo[] temp = new MemberVo[members.length -1];
			for(int i=0;i<members.length;i++) {
				if(i == deleteIndex) {
					continue;
				}else if(i > deleteIndex) {
					temp[i-1] = members[i];
				}else {
					temp[i] = members[i];
				}
				
			}
			
			MemberMain.members = temp;
			
		}else {
			System.out.println("삭제할 ID가 없습니다.");
		}
			
	}

}
