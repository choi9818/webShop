<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 검색창</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
   $(function(){
	   $("#searchBtn").click(function(){
		   $.ajax({
			   url:"retrieveByJob",
			   data:{"job_id":$("#job_id").val() },
			   success: function(responseData){
				   $("#here").html(responseData);
			   }
		   });
	   });
	   
	  
   });
  </script>

</head>
<body>

	직책이름:
	<input type="text" id="job_id" name="job_id">
	<br>
	<input type="button" id="searchBtn" value="조회하기">

	<hr>
	<div id="here">여기에 출력</div>
</body>
</html>
