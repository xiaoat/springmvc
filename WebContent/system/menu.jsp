<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<!DOCTYPE HTML>
<html>
 <head>
  <title>菜单管理</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="<%=path %>/system/menu.js"></script>
 </head>
 <body>
	<div style="width:100%; height:100%" id="menu.viewMenu"></div>
 </body>
</html>