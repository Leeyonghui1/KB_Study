package customer;

import java.util.List;

public interface CustomerService {
	// ���� ���� ����
	void customer_insert(CustomerVo vo);
	
	// ��� ��ȸ
	List<CustomerVo> customer_list();
	
	// �� ��ȸ
	CustomerVo customer_detail(int id);
	
	// �� ���� ���� ����
	void customer_update(CustomerVo vo);
	
	// �� ���� ����
	void customer_delete(int id);
}
