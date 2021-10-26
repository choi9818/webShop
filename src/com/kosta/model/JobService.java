package com.kosta.model;

import java.util.List;

public class JobService {
	JobDAO dao = new JobDAO();
	public List<JobVO> selectAll() {//jobDAO에 가서 조회하고 반환
		return dao.selectAll();	
	}
}
