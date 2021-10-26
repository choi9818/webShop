package com.kosta.model;

import java.util.List;

//사용자요청-->controller->service->dao->db
//Service:하나의 업무 단위(ex,이체하기(출금,입금), 입고하기(입고insert, 재고update)-DAO
public class EmpService {
	EmpDAO dao = new EmpDAO();
	
	public int empDelete(int empid) {
		return dao.empDelete(empid);
	}
	
	public int empUpdate(EmployeeVO emp) {
		return dao.empUpdate2(emp);
	}
	
	public int empInsert(EmployeeVO emp) {
		return dao.empInset(emp);
	}
	
	public void test() {
		System.out.println("db에 가지 않아도 되는 Business locig작성");
	}
	
	//dao에 여러 작업을 호출 할 수도 있다.
	public void 이체하기() {//입금+출금
		dao.withdraw();
		dao.deposit();
	}
	
	//dao에 가서 수행하고 받은 값을 Controller에게 보낸다..
	public List<EmployeeVO> selectAll() {
		return dao.selectAll();
	}
	public List<EmployeeVO> selectById(int deptid) {
		return dao.selectById(deptid);
	}
	public List<EmployeeVO> selectSalary(int sal) {
		return dao.selectSalary(sal);
	}
	public List<EmployeeVO> selectByJob(String jobid) {
		return dao.selectByJob(jobid);
	}
	
	public List<EmployeeVO> selectByCondition(int deptid, String jobid, int sal, String hdate) {
		return dao.selectByCondition(deptid, jobid, sal, hdate);
	}

	public EmployeeVO selectByEmpid(int empid) {
		// TODO Auto-generated method stub
		return dao.selectByEmpid(empid);
	}
	
	public List<EmployeeVO> selectAllManager() {
		return dao.selectAllManager();
	}
	
}
