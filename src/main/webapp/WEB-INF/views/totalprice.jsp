<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>合計金額</h2>

■税抜き価格<br>
<c:out value="${total}" />円<br>
■税込み価格<br>
<c:out value="${totalTax}" />円

</body>
</html>