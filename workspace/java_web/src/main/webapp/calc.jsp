<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form name="form1" method="post" action="CalcServlet">
			<input type="number" name="num1" size="5" required>
			<select name="opt">
				<option value="+" selected>+</option>
				<option value="-">-</option>
				<option value="*">*</option>
				<option value="/">/</option>
			</select>
			<input type="number" name="num2" size="5" required>
			<button type="submit">계산</button>
			<button type="reset">초기화</button>
		</form>
		<h3>결과: ${result}</h3>
	</body>
</html>