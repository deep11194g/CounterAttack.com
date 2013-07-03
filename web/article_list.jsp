<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArticleList</title>
    </head>
    
    <body>
        <h1 style="text-align:center;color:black;text-decoration:underline;">Articles</h1>
        <div>
            <center>
            <ul style="position:relative;left:20px;line-height:150%;">
            <c:forEach var="data" items="${requestScope.result.rows}">
                <li><a href="#">${data.artName} by ${data.name}<a></li><br>
            </c:forEach>
            </ul>
            </center>
        </div>
    </body>
    
</html>
