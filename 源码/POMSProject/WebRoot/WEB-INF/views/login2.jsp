<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
		<form action="center/personManage/login" method="post">
			账号：<input type= "text" name="operatorID"/>
			密码:<input type="text" name="password"/>
			<input type="submit" value="登录"/>
		</form>
		<button id="button" name="1234" value="123123213123">123213</button>
  </body>
  <script src="/POMSProject/vendor/jquery/jquery.min.js"></script>
  
  <script type="text/javascript">
  $("#button").click(function(){
  $.ajax({
        url: "/POMSProject/center/dictionaryMaintain/departmentList",
        type: "GET",
        dataType: "json",
        success: function(data) {
        alert(data.size);
        }
        })
  })
  </script>
</html>
