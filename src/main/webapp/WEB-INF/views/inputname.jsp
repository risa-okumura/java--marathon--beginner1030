<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/nameReceive/input" method="post">
名前：<input type="text" name="name"/><br>
<input type="submit" value="送信"/>
</form>

</body>
</html>