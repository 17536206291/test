<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page  pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
<head>
</head>
<body>
  <table cellpadding="0px" cellspacing="0px" border="1px" align="center" width="80%">
      <tr bgcolor="green">
          <th>用户ID</th>
          <th>用户名</th>
          <th>密码</th>
          <th>年龄</th>
          <th>操作</th>
      </tr>
      <c:forEach items="${requestScope.users}" var="user">
          <tr>
              <td>${user.id}</td>
              <td>${user.username}</td>
              <td>${user.password}</td>
              <td>${user.age}    </td>
              <td><a href="${pageContext.request.contextPath}/test/deleteIds?ids=${user.id}">删除</a></td>
          </tr>
      </c:forEach>
  </table>

</body>
</html>