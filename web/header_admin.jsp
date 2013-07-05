
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>CounterAttack</title>
        <link rel="stylesheet" type="text/css" />
        <style>
            ul#nav {margin: 0 0 0 200px;}
            ul.drop a { display:block; color: #fff; font-family: Verdana; font-size: 14px; text-decoration: none;}
            ul.drop, ul.drop li, ul.drop ul { list-style: none; margin: 0; padding: 0; }
            ul.drop { position: relative; z-index: 597; float: left; }
            ul.drop li { float: left; line-height: 1.3em; vertical-align: middle; zoom: 1;}
            ul.drop li.hover, ul.drop li:hover { position: relative; z-index: 599; cursor: default; }
            ul.drop ul { visibility: hidden; position: absolute; top: 100%; right: 0; z-index: 598;}
            ul.drop ul li { float: none; }
            ul.drop ul ul { top: -2px; left: 100%; }
            ul.drop li:hover > ul { visibility: visible }
        </style>
    </head>
    <body>
        <div>
            <a href="landing.jsp"><img src="images/logo.png" style="float:left;"></a>
        </div>
        
        <div style="float:right;height:30px">
            <ul id="nav" class="drop">
                <li><a href="signin.do"><img src="images/home_tab.png" style="margin-right:5px;"></a></li>
                <li><img src="images/options/admin_option_head.png">
                    <ul>
                        <li><a href="seeUsers.do"><img src="images/options/see_details.png" style="margin-top:-3px"></a></li>
                        <li><a href="uploadAdmin.do"><img src="images/options/u_upload_article.png" style="margin-top:-3px"></a></li>
                        <li><a href="logout.do"><img src="images/options/logout.png" style="margin-top:-3px"></a></li>
                    </ul>
                </li>
            </ul>
        </div>

    </body>
</html>
