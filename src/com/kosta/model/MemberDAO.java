package com.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kosta.util.DBUtil2;

public class MemberDAO {
	public MemberVO loginChk(int mid, String mpw) {
		MemberVO member = null;
		String sql = "select * from member where mid=? and mpw=?";
		Connection conn = DBUtil2.dbConnect();// DB연결
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement(sql);
			st.setInt(1,  mid);
			st.setString(2,  mpw);
			rs = st.executeQuery();// rs:결과 받는
			while (rs.next()) {
				member = new MemberVO(mid, mpw, 
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil2.dbClose(conn, st, rs);
		}
		return member;
	}
}
