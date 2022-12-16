package member;

import java.util.HashMap;
import java.util.List;



public interface MemberService {
	// �Ƿ��� ��� ��ȸ
	List<MemberVo> member_list();
	
	// ȸ�����Խ� ȸ�� ���� ����
	boolean member_insert(MemberVo vo);
	
	// �������������� ȸ�� ���� Ȯ��
	MemberVo member_select(String id);
	
	// �α���
	MemberVo member_login(HashMap<String, Object> map);
	
	// ���̵� �ߺ� Ȯ��
	boolean member_id_check(String id);
	
	// ���������� ȸ�� ���� ���� ����
	boolean member_update(MemberVo vo);
	
	// ȸ�� Ż��
	boolean member_delete(String id);
}
