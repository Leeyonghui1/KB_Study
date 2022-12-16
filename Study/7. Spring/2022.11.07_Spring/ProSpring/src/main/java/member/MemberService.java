package member;

import java.util.HashMap;
import java.util.List;



public interface MemberService {
	// 의료진 목록 조회
	List<MemberVo> member_list();
	
	// 회원가입시 회원 정보 저장
	boolean member_insert(MemberVo vo);
	
	// 마이페이지에서 회원 정보 확인
	MemberVo member_select(String id);
	
	// 로그인
	MemberVo member_login(HashMap<String, Object> map);
	
	// 아이디 중복 확인
	boolean member_id_check(String id);
	
	// 마이페이지 회원 정보 변경 저장
	boolean member_update(MemberVo vo);
	
	// 회원 탈퇴
	boolean member_delete(String id);
}
