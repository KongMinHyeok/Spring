<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customer::modify</title>
	</head>
	<body>
		<h3>고객수정</h3>
	
		<a href="/BookStore1/">처음으로</a>
		<a href="/BookStore1/customer/list">고객목록</a>
		<form action="/BookStore1/customer/modify" method="post">
			<table border="1">
				<tr>
					<td>고객번호</td>
					<td><input type="text" name="cusId" readonly value="${customer.cusId}"/></td>
				</tr>
				<tr>
					<td>고객명</td>
					<td><input type="text" name="cusName" value="${customer.cusName}"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="cusAddr" value="${customer.cusAddr}"/></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="cusHp" value="${customer.cusHp}"/></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input type="submit" value="수정"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>