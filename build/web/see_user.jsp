<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>See_User</title>
    </head>
    <body>
        <table border="2" align="center">
            <tr>
                <th>Username</th>
                <th>Role</th>
                <th>Options</th>
            </tr>
            <c:forEach var="data" items="${requestScope.result.rows}">
                <tr>
                    <td>${data.name}</td>
                    <td>${data.role}</td>
                    <td><a href="delete.do?name=${data.name}">Delete</a>, 
                        <a href="upgrade.do?name=${data.name}">Upgrade</a></td>
                </tr>
            </c:forEach>
        </table>
        <center><br><br><font color="red" size="5">${requestScope.del_msg} </font></center>
        <center><br><br><font color="red" size="5">${requestScope.up_msg} </font></center>
        
    </body>
</html>
