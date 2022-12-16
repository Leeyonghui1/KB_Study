package member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;
	
	// ���̵� �ߺ� üũ Ȯ��
	@Override
	public boolean id_check(String id) {
		return dao.id_check(id);
	}
	
	// ȸ������
	@Override
	public String join(Map<String, Object> map) {
		int affectRowCount = this.dao.join(map);
		if(affectRowCount == 1) {
			return map.get("id").toString();
		}
		return null;
	}
	
	// �α���
	@Override
	public MemberDTO login(HashMap<String, String> map) {
		return dao.login(map);
	}
	
	// ȸ�� �� ȭ��
	@Override
	public MemberDTO detail(String id){
		return dao.detail(id);
	}
	
	
	// �Ƿ��� ��� ��ȸ
	@Override
	public List<MemberDTO> member_list() {
		return dao.member_list();
	}
	
}
