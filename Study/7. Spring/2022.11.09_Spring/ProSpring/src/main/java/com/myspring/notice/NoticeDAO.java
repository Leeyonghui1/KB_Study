package com.myspring.notice;



import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<NoticeDTO> notice_list(){
		return this.sqlSessionTemplate.selectList("hospital.notice_list");
	}
	
}
