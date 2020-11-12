<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--  태그라이브러리 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이벤트 목록</h1>
	<h2>${message }</h2>
	<table>
		<tr>
			<th>이름</th>
			<th>시작</th>
		</tr>
		<c:forEach items="${events}" var="event">
			<tr>
				<td>${event.name }</td>
				<td>${event.starts }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>