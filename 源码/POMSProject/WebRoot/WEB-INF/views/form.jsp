<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'form.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
		<form:form method="POST" action="/POMSProject/advice/sendAdvice">
		<table>
			<tr>
				<td><form:label path="receiveDeptID">接收部门ID</form:label></td>
				<td><form:input path="receiveDeptID"/></td>
			</tr>
			<tr>
				<td><form:label path="receiveStationID">接收分站ID</form:label></td>
				<td><form:input path="receiveStationID"/></td>
			</tr>
			<tr>
				<td><form:label path="content">内容</form:label></td>
				<td><form:input path="content"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Submit"/>
				</td>
			</tr>
		</table>
	</form:form>
  </body>
</html>
