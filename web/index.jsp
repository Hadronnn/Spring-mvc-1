<%--
  Created by IntelliJ IDEA.
  User: 13646
  Date: 2019/7/8
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form name="account" action="${pageContext.request.contextPath}/hello" method="post">
    <input name="name" type="text"/>
    <input type="submit"/>
  </form>
<%--  <img src="${pageContext.request.contextPath}/static/images/1.jpg" alt="图片加载失败">--%>
  <hr>
  <form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <input name="file" type="file"/>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
