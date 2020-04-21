<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="skill.learnprogramming.util.Mappings" %>
<html>
<head>
    <title>Todo List Application</title>

</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mapping.ITEMS}"/>
        <h2><a href="${itemsLink}">Show Todo Items</a></h2>
    </div>
</body>
</html>


