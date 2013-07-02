<%@taglib prefix="h" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload</title>
    </head>
    <body>
        <center>
        <h:form action="upload.do" enctype="multipart/form-data">
            Select: <h:file property="" style="font-size:20px;width:200px;height:50px;"/> (.txt only)<br>
            <h:submit value="Submit article" style="height:50px;width:80px;font-size:20px;"/>
            <br><font color="red" size="5">${requestScope.upload_msg} </font>
        </h:form>
        </center>   
    </body>
</html>
