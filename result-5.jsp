<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.lyq.Bean1.Email"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证结果</title>
</head>
<body>
<div align="center">
	<%
		// 获取邮箱地址
		String mailAdd = request.getParameter("mailAdd");
		// 实例化Email,并对mailAdd赋值
		Email email = new Email(mailAdd);
		// 判断是否是标准的邮箱地址
		if(email.isEmail()){
			out.print(mailAdd + " <br>是一个标准的邮箱地址！<br>");
		}else{
			out.print(mailAdd + " <br>不是一个标准的邮箱地址！<br>");
		}
	%>
	<a href="index-5.jsp">返回</a>
</div>
</body>
</html>