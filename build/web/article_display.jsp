<%@taglib  prefix="h" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h:html>
    <head>
        <title>ArticleDisplay</title>
    </head>
    <body>
        
        <div style="margin-right:450px;margin-left:80px;">
            
            <div style="position:fixed;top:300px;right:300px;width:300px;text-align: right;">
               
            </div>
                
            <h1 style="text-decoration:underline;">${requestScope.desc}</h1>
            <h2>by ${requestScope.name}</h2>

            <div style="margin-left:150px;text-align: right;margin-right: ">
                <p>${requestScope.article}</p>
            </div>
	</div>
            
    </body>
</h:html>
