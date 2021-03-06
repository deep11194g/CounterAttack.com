<%@taglib  prefix="h" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h:html>

    <head>
        <title>Index</title>
        <style>
            #signin{position:absolute;right:20px;width:600px;height:300px;text-align:right;}
            #newusr{position:relative;top:400px;margin-left:auto;margin-right:auto;width:1200px;height:80px;}
        </style>
    </head>

    <body>
        <div>
            <a href="landing.jsp"><img src="images/logo.png" style="float:left;"></a>
            <hr style="clear:left">
        </div>
           
        <div id="background" style="position: fixed;z-index: -1;top: 0px;left: 0px;">
            <img src="images/background_new.png" style="width: 100%;height:100%;">
        </div>
        
        <div id="signin">
            <img src="images/login.png">
            <h:javascript formName="LoginBean"/>
            <h:form action="signin.do" onsubmit="return validateLoginBean(this)">
                <p><img src="images/login_username.png"><h:text property="name" style="font-size:20px;width:200px;height:50px;margin-left:10px;"/></p>
                <p><img src="images/login_password.png"><h:password property="password" style="font-size:20px;width:200px;height:50px;margin-left:10px;"/></p>
                <h:submit value="Log In" style="height:50px;width:80px;font-size:20px;"/>
                <br><font color="red" size="5">${requestScope.login_msg} </font>
            </h:form>
        </div>
            
        <div id="newusr">
            <center><img src="images/sign_up.png"></center>
            <h:javascript formName="SignUpBean"/>
            <h:form action="signup.do" onsubmit="return validateSignUpBean(this)">
                <p><img src="images/username_signup.png"><h:text property="name" style="font-size:20px;position:relative;top:-10px;width:200px;height:50px;margin-left:10px"/>
                    <img src="images/password_signup.png"><h:password property="password" style="font-size:20px;position:relative;top:-10px;width:200px;height:50px;margin-left:10px"/>
                    <h:submit value="Sign Up" style="text-align:center;font-size:20px;position:relative;top:-10px;height:50px;width:90px;"/>
                    <font color="red" size="5">${requestScope.signup_msg} </font> </p>
            </h:form>
        </div>
     
    </body>

</h:html>
