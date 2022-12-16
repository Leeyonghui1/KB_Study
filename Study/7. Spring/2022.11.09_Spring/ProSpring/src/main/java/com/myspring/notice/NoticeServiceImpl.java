package com.myspring.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	NoticeDAO dao;

	@Override
	public List<NoticeDTO> notice_list() {
		return this.dao.notice_list();
	}
	
	
	
}
