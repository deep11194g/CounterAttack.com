<%@taglib prefix="h" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h:html>
    <head>
        <title>Upload</title>
    </head>
    <body>
        <center>
        <h:form action="upload.do" method="post" enctype="multipart/form-data" onsubmit="return validateUploadBean(this)">
            Select: <h:file property="upArticle" style="font-size:20px;width:300px;height:50px;"/>
                    <font color="red" size="5">(.txt only)<br><br>
            <h:submit value="Submit article" style="height:30px;width:130px;font-size:20px;"/>
            <br><font color="blue" size="5"> ${requestScope.upload_msg} </font>
            <br><font color="red" size="4"> ${requestScope.approval_msg} </font>
        </h:form>
        </center>   
    </body>
</h:html>
