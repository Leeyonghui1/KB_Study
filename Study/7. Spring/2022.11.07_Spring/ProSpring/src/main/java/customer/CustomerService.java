package customer;

import java.util.List;

public interface CustomerService {
	// 정보 삽입 저장
	void customer_insert(CustomerVo vo);
	
	// 목록 조회
	List<CustomerVo> customer_list();
	
	// 상세 조회
	CustomerVo customer_detail(int id);
	
	// 고객 정보 변경 저장
	void customer_update(CustomerVo vo);
	
	// 고객 정보 삭제
	void customer_delete(int id);
}
