<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
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
        <br><br><br>
    </body>
</html>
