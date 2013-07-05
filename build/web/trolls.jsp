
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trolls</title>
    </head>
    
    <body>
        
        <br>
        <h1 style="text-align:center;">Trolls</h1><br><br>
        <div style="position:absolute;left:200px;top:200px;"><a href="trolls.do"><img src="images/arrow1.png"><a></div>
        
        <div style="width:350px;margin-right:250px;margin-left:250px;">
            <img src="trolls/${requestScope.no}.jpg">
	</div>
                    
	<div style="position:absolute;right:200px;top:200px;"><a href="trolls.do"><img src="images/arrow2.png"><a></div>
        
    </body>
</html>
