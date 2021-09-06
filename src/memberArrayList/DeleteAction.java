package memberArrayList;

import java.util.List;
import java.util.Scanner;

public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		
		System.out.print("삭제할 ID : ");
		String id = sc.next();
		MemberVo member = null;
		List<MemberVo> members = MemberMain.members;
		int deleteIndex = -1;
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getId().equals(id)) {
				deleteIndex = i;
				break;
			}
		}
		
		if(deleteIndex != -1) {
			//add(), get(), remove(int index), remove(Object o)\
			members.remove(deleteIndex);
		}else {
			System.out.println("삭제할 ID가 없습니다.");
		}
			
	}

}
