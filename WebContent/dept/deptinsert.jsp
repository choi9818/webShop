<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 신규 등록</title>
</head>
<body>
<h1>부서 신규 등록</h1>
<form action="deptinsert" method="post">
부서코드:<input type="text" name="department_id" ><br>
부서이름:<input type="text" name="department_name" ><br>
매니저이름:<input type="text" name="manager_id" ><br>
지역코드<input type="text" name="location_id" ><br>
<input type="submit" value="등록하기">
<input type="reset" value="다시">
</form>
</body>
</html>