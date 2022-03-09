<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_form_tag_library
  File name(文件名): addUser
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/9
  Time(创建时间)： 14:23
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fm:form method="post" modelAttribute="user" action="${pageContext.request.contextPath}/showUser">
    用户名：<fm:input path="name"/>
    <br/>
    年龄：<fm:input path="age"/>
    <br/>
    身高：<fm:input path="height"/>
    <br/>
    <input type="submit" value="保存"/>
</fm:form>
</body>
</html>
