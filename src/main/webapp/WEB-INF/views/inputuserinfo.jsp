<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userInfo/inputuserinfo" method="post">
名前：<input type="text" name="name"><br>
年齢：<input type="text" name="age"><br>
住所：<input type="text" name="address"><br>
<input type="submit" value="送信">

</form>

</body>
</html>