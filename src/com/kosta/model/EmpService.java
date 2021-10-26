package com.kosta.model;

import java.util.List;

//����ڿ�û-->controller->service->dao->db
//Service:�ϳ��� ���� ����(ex,��ü�ϱ�(���,�Ա�), �԰��ϱ�(�԰�insert, ���update)-DAO
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
		System.out.println("db�� ���� �ʾƵ� �Ǵ� Business locig�ۼ�");
	}
	
	//dao�� ���� �۾��� ȣ�� �� ���� �ִ�.
	public void ��ü�ϱ�() {//�Ա�+���
		dao.withdraw();
		dao.deposit();
	}
	
	//dao�� ���� �����ϰ� ���� ���� Controller���� ������..
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
