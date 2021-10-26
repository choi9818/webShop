package com.kosta.model;

import java.util.List;

public class DeptService {
	DeptDAO dao;
	
	public DeptService(String path) {
		dao = new DeptDAO(path);
	}
	
	//dao�� ���� �����ϰ� ���� ���� Controller���� ������..
	public List<DeptDTO> selectAll() {
		return dao.selectAll();
	}	
	public DeptDTO selectById(int deptid) {
		return dao.selectById(deptid);
	}
	public List<DeptDTO> selectByName(String dname) {
		return dao.selectByName(dname);
	}
	public List<DeptDTO> selectByLoc(int locid) {
		return dao.selectByLoc(locid);
	}

	public int updateService(DeptDTO dept) {
		// TODO Auto-generated method stub
		return dao.updateDept(dept);
	}
	
	public int insertService(DeptDTO dept) {
		// TODO Auto-generated method stub
		return dao.insertDept(dept);
	}
	
	public int deleteService(int deptid) {
		// TODO Auto-generated method stub
		return dao.deleteDept(deptid);
	}

	
}
