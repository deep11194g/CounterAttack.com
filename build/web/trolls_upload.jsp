<%@taglib prefix="h" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload</title>
    </head>
    <body>
        <center>
        <h:form action="submitTrolls.do" method="post" enctype="multipart/form-data" onsubmit="return validateUploadTrollsBean(this)">
            Select: <h:file property="upTrolls" style="font-size:20px;width:300px;height:50px;"/>
                    <font color="red" size="5">(.jpg only)<br><br>
            <h:submit value="Upload Trolls" style="height:30px;width:130px;font-size:20px;"/>
            <br><font color="blue" size="5"> ${requestScope.upload_msg} </font>
        </h:form>
        </center>   
    </body>
</h:html>
