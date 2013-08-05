<%@taglib  prefix="t" uri="/WEB-INF/struts-tiles.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <table width="100%" align="center">
            <tr>
                <td><t:insert attribute="header_admin"/></td>
            </tr>
            <tr>
                <td><t:insert attribute="menu"/></td>
            </tr>
            <tr>
                <td><t:insert attribute="body"/></td>
            </tr>
            <tr>
                <td><t:insert attribute="footer"/></td>
            </tr>
        </table>

    </body>
</html>
