package customer;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO implements CustomerService {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void customer_insert(CustomerVo vo) {
		this.sqlSessionTemplate.insert("customer.insert", vo);
	}

	@Override
	public List<CustomerVo> customer_list() {
		return this.sqlSessionTemplate.selectList("customer.list");
	}

	@Override
	public CustomerVo customer_detail(int id) {
		return this.sqlSessionTemplate.selectOne("customer.detail", id);
	}

	@Override
	public void customer_update(CustomerVo vo) {
		this.sqlSessionTemplate.update("customer.update", vo);
	}

	@Override
	public void customer_delete(int id) {
		this.sqlSessionTemplate.delete("customer.delete", id);
	}
	
	
}
