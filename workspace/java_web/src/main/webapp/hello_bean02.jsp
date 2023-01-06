<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="msg" class="serv.HelloBean"></jsp:useBean>
<jsp:setProperty property="*" name="msg"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>안녕하세요</title>
	</head>
	<body>
		<form name="form1" method="post" action="hello_bean02.jsp">
			이름을 입력해 주세요 : <input type="text" name="user_name" size="5" required>
			<button type="submit">확인</button>
			<button type="reset">초기화</button>
		</form>
		<c:if test="${not empty msg.user_name}">
			<h3>안녕하세요, ${msg.user_name}님!</h3>
		</c:if>
		
		<form name="form2" method="post">
			이름을 입력해 주세요 : <input type="text" name="user_name" id="user_name" size="5" required>
			<button type="button" id="btnSend">확인</button>
			<button type="reset">초기화</button>
		</form>

		<h3>안녕하세요, ${msg.user_name}님!</h3>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js" integrity="sha512-STof4xm1wgkfm7heWqFJVn58Hm3EtS31XFaagaa8VMReCXAkQnJZ+jEy8PCC/iT18dFy95WcExNHFTqLyp72eQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
		<script src="https://cdn.jsdelivr.net/npm/vue@2.7.14"></script>
		<script type="text/javascript">
			
		</script>
	</body>
</html>