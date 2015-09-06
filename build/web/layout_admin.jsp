<%@taglib  prefix="t" uri="/WEB-INF/struts-tiles.tld" %>

<html>
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
