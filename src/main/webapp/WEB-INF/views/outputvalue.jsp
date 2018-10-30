<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:out value="${number1} " />
	×
	<c:out value="${number2} " />
	=
	<c:out value="${answer} " />
	<br>

	<a href="/calc/outputvalue">次へ</a>

</body>
</html>