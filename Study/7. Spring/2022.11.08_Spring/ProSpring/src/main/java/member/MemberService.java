package member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MemberService {

	List<MemberDTO> member_list();

	boolean id_check(String id);

	String join(Map<String, Object> map);

	MemberDTO login(HashMap<String, String> map);

	MemberDTO detail(String id);

}
