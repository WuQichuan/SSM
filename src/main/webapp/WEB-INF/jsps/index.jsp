<%--
  Created by IntelliJ IDEA.
  User: WuQiChuan
  Date: 2018/7/16
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form id="employeeForm" action="${pageContext.request.contextPath }/employee/addEmployee.do" method="post">
    姓名：<input type="text" name="empName">
    年龄：<input type="text" name="empAge">
    性别：<input type="text" name="empSex">
    部门号：<input type="text" name="empDepId">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
