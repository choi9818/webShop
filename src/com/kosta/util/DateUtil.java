package com.kosta.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
	public static Date convertToDate(String sdate) {//new하지 않고 메모리에 늘 있는 데이터 쓰기 위해 static으로 만듦
		Date result = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			java.util.Date d = sdf.parse(sdate);
			result = new Date(d.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
}
