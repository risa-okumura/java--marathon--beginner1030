<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/register/buygoods" method="post">

商品1:<input type="text" name="goods1"><br>
商品2:<input type="text" name="goods2"><br>
商品3:<input type="text" name="goods3"><br>
<input type="submit" value="購入">

</form>

</body>
</html>