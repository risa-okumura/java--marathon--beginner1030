<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
名前：<c:out value="${user.name}" /><br>
年齢：<c:out value="${user.age}" /><br>
住所：<c:out value="${user.address}" /><br>

</body>
</html>