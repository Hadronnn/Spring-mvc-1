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
  </body>
</html>
