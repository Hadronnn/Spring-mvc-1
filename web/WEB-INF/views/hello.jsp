<%--
  Created by IntelliJ IDEA.
  User: 13646
  Date: 2019/7/8
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World!</h1>
<h2><%=request.getParameter("name") %></h2>

<div>
    <img src="${pageContext.request.contextPath}/static/images/1.jpg" alt="图片加载失败">
</div>
</body>
</html>
