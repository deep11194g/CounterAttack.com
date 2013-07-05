<%@taglib  prefix="h" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ChangeDetailsUser</title>
    </head>
    <body>
        <center>
            <br><h:javascript formName="ChangeDetailBean"/>
            <h:form action="changeDetail.do" onsubmit="return validateLoginBean(this)">
                New Password<h:password property="password" style="font-size:20px;width:200px;height:50px;"/>
                <h:submit value="Change Password" style="height:50px;width:80px;font-size:20px;"/>
                <br><font color="red" size="5">${requestScope.change_msg} </font>
            </h:form><br><br><br>
        </center>
    </body>
</html>
