package com.kosta.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtil { //DBUtil.dbConnect=>DB연결하고 싶으면 이 구문 쓰면 됨
	
	public static void dbClose(Connection conn, Statement st, ResultSet rs) {
		//자원반납
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static Connection dbConnect(String path) {
		//db연결
		Connection conn = null;
		String url, id, pass;
		try {
			//클래스를 메모리에 로드하는
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Properties pro = new Properties();
			path += "\\WEB-INF\\dbinfo.properties";
			pro.load(new FileReader(path));
			url = pro.getProperty("url");
			id = pro.getProperty("userid");
			pass = pro.getProperty("password");
			conn = DriverManager.getConnection(url, id, pass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//업무로직
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}
}
