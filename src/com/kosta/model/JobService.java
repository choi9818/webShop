package com.kosta.model;

import java.util.List;

public class JobService {
	JobDAO dao = new JobDAO();
	public List<JobVO> selectAll() {//jobDAO�� ���� ��ȸ�ϰ� ��ȯ
		return dao.selectAll();	
	}
}
