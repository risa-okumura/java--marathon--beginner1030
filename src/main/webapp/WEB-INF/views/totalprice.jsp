<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>合計金額</h2>

■税抜き価格<br>
<fmt:formatNumber value="${total}" pattern="###,###" />円<br>
■税込み価格<br>
<fmt:formatNumber value="${totalTax}" pattern="###,###" />円

</body>
</html>