package customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDAO dao;

	@Override
	public void customer_insert(CustomerVo vo) {
		dao.customer_insert(vo);
	}

	@Override
	public List<CustomerVo> customer_list() {
		return dao.customer_list();
	}

	@Override
	public CustomerVo customer_detail(int id) {
		return dao.customer_detail(id);
	}

	@Override
	public void customer_update(CustomerVo vo) {
		dao.customer_update(vo);
	}

	@Override
	public void customer_delete(int id) {
		dao.customer_delete(id);
	}
	
	
}
