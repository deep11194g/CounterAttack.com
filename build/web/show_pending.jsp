<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PendingList</title>
    </head>
    
    <body>
        <h1 style="text-align:center;color:black;text-decoration:underline;">Accept Pending Articles</h1>
        <div>
            <center>
                <table border="3">
                    <tr>
                        <th>Article Name</th>
                        <th>User's Name</th>
                        <th>Options</th>
                    </tr>
                    
                    <c:forEach var="data" items="${requestScope.result.rows}">
                    <tr>
                            <td><a href="articleDisplay.do?artName=${data.artName}&name=${data.name}">${data.artName}</a></td>
                            <td>${data.name}</td>
                            <td><a href="yesPending.do?artName=${data.artName}">Yes Approve</a><br> 
                                <a href="delPending.do?artName=${data.artName}">No Delete</a>
                            </td>
                    </tr>
                    </c:forEach>
                    
                </table>
                <br> <font color="red" size="5">${requestScope.msg} </font>
            </center>
        </div>
    </body>
    
</html>
