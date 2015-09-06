<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>ArticleList</title>
    </head>
    
    <body>
        <h1 style="text-align:center;color:black;text-decoration:underline;">Articles</h1>
        <div>
            <center>
            <ul style="position:relative;left:20px;line-height:150%;">
            <c:forEach var="data" items="${requestScope.result.rows}">
                <li><a href="articleDisplay.do?artName=${data.artName}&name=${data.name}"> ${data.artName} by ${data.name}<a></li><br>
            </c:forEach>
            </ul>
            </center>
        </div>
    </body>
    
</html>
