package com.myspring.mypro;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	HospitalDao hospitalDao;
	
	@Override
	public String join(Map<String, Object> map) {
		int affectRowCount = this.hospitalDao.insert(map);
		if(affectRowCount == 1)
			return map.get("id").toString();
		return null;
	}

	@Override
	public int idCheck(String memberId) {
		int result = this.hospitalDao.idCheck(memberId);
		return result;
	}

	
	
	
	
}
