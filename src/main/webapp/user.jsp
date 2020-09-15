<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>

</head>


<body>
<form action="${path}/test/userID" method="POST">
    名字：
    <input type="text"  name="id"><br/>
    <input type="reset" value="重置" name="resetanniu">
    <input type="submit" value="提交">
</form>
</body>










</html>