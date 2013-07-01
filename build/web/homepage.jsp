
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>CounterAttack</title>
        <link rel="stylesheet" type="text/css" href="default.css" />
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
        
        <div style='position:absolute;z-index:0;left:0;top:0;width:100%;height:100%'>
            <img src='images/background.png' style='width:100%;height:100%'  />
        </div>

        <div style="float:right;height:30px">
            <ul id="nav" class="drop">
                <li><img src="images/usrm/user_option_head.png">
                    <ul>
                        <li><img src="images/usrm/u_change_details.png" style="margin-top:-5px"></li>
                        <li><img src="images/usrm/u_upload_article.png" style="margin-top:-5px"></li>
                        <li><img src="images/usrm/u_check_ur_score.png" style="margin-top:-5px"></li>
                        <li><img src="images/usrm/logout.png" style="margin-top:-5px"></li>
                    </ul>
                </li>
            </ul>
        </div>

        <hr style="clear:left;visibility:hidden;">

        <div>
            <a href="art.html"><img src="images/art.png" style="border:none;margin-left:-8px;"></a>
            <a href="com.html"><img src="images/com.png" style="border:none;margin-left:-4px;"></a>
            <a href="deb.html"><img src="images/deb.png" style="border:none;margin-left:-4px;"></a>
            <a href="tro.html"><img src="images/tro.png" style="border:none;margin-left:-4px;"></a>
            <a href="tro.html"><img src="images/menubar_continuos.png" style="border:none;margin-left:-4px;"></a>
        </div>


    </body>
</html>

