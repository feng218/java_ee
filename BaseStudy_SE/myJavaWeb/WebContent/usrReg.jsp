<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>usrReg.jsp page 用户注册页面</title>
	</head>
	<body>
		<h1>用户注册</h1><br />
		<!-- <form name="regForm" action="request.jsp" method="post"> -->
		<form name="regForm" action="response.jsp" method="post">
			<table>
				<tr>
					<td>用户名</td>
					<td><input type="text" name="username"/></td>
				</tr>
				<tr>
					<td>爱好</td>
					<td>
						<input type="checkbox" name="favorite" value="read"/>读书
						<input type="checkbox" name="favorite" value="music"/>音乐
						<input type="checkbox" name="favorite" value="movie"/>电影
						<input type="checkbox" name="favorite" value="internet"/>上网
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="注册"/>
					</td>
				</tr>
			</table>
		</form>
		
		<hr />
		<br />
		<br />
		<a href="request.jsp?username=李四" >测试URL传参数</a>
		
	</body>
</html>