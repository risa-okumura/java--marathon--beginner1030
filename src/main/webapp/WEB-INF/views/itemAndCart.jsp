<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>商品一覧</h2>
<table>
<c:forEach var="item" items="${itemList}" varStatus="status">
<tr><td>
<form action="${pageContext.request.contextPath}/item/insert" method="post">
		<c:out value="${item.name}"/>
		<fmt:formatNumber value="${item.price}" pattern="###,###"/>円
		<input type="hidden" name="index" value="${status.index}">
		<input type="submit" value="カートへ" ><br>
	</form>
</tr>
</c:forEach>
</table>
<h2>ショッピングカート</h2>
	<c:forEach var="item" items="${itemList2}" varStatus="status">
	<form action="${pageContext.request.contextPath}/item/delete" method="post">
		<c:out value="${item.name}"/>
		<fmt:formatNumber value="${item.price}" pattern="###,###"/>円
		<input type="hidden" name="index" value="${status.index}">
		<input type="submit" value="削除" ><br>
	</form>
	</c:forEach>
	合計金額：<fmt:formatNumber value="${total}" pattern="###,###"/>円


</body>
</html>