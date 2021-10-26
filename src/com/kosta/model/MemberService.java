package com.kosta.model;

public class MemberService {
	public MemberVO loginChk(int mid, String mpw) {
		MemberDAO dao = new MemberDAO();
		return dao.loginChk(mid, mpw);
	}
}
