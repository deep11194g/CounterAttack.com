<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Trolls</title>
    </head>
    
    <body>
        
        <br>
        <h1 style="text-align:center;">Trolls</h1><br><br>
        <div style="position:absolute;left:200px;top:200px;"><a href="trollsLeft.do?ID=${requestScope.ID}"><img src="images/arrow1.png"><a></div>
        
        <div style="width:350px;margin-right:250px;margin-left:250px;">
            ${requestScope.path}
	</div>
                    
	<div style="position:absolute;right:200px;top:200px;"><a href="trollsRight.do?ID=${requestScope.ID}"><img src="images/arrow2.png"><a></div>
        
    </body>
</html>
