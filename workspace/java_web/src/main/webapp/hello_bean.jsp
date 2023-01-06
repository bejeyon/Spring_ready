<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="msg" class="serv.HelloBean"></jsp:useBean>
<jsp:setProperty property="*" name="msg"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form name="form1" method="post" action="hello_bean.jsp">
			<input type="text" name="user_name" size="5" required>
			<button type="submit">확인</button>
			<button type="reset">초기화</button>
		</form>
		
		<c:if test="${msg.user_name != null}">
			<h3>안녕하세요, ${msg.user_name}님!</h3>
		</c:if>
		
		<form name="form2" method="post">
			<input type="text" name="user_name" id="user_name" size="5" required>
			<button type="button" id="btnSend">전송</button>
			<button type="reset">초기화</button>
		</form>
		
		<h3>안녕하세요, <span id="u_name"></span>님!</h3>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js" integrity="sha512-STof4xm1wgkfm7heWqFJVn58Hm3EtS31XFaagaa8VMReCXAkQnJZ+jEy8PCC/iT18dFy95WcExNHFTqLyp72eQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
		<script>
			$('#btnSend').on('click', function() {
				$('#u_name').text($('#user_name').val());
			});
		</script>
	</body>
</html>