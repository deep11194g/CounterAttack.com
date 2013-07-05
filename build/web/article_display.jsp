
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ArticleDisplay</title>
    </head>
    <body>
        
        <div style="margin-right:400px;margin-left:100px;">
            <h1 style="text-decoration:underline;">${requestScope.desc}</h1>
            <h2>by ${requestScope.name}</h2>

            <div style="margin-right:150px;margin-left:100px;">
		<!-- Text -->
                <p>${requestScope.article}</p>
                    
            </div>
	</div>
        
    </body>
</html>
