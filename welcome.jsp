<%-- 
    Document   : welcome.jsp
    Created on : Mar 9, 2019, 2:41:54 PM
    Author     : HP EliteBook 8460p
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Welcome 
            <%=request.getAttribute("user")%>        
        </h1>
        <span>
         
            <a href="test_c.jsp" style="margin-right: 10px;">C/C++</a>
            <a href="test_java.jsp" style="margin-right: 10px;">java</a>
            <a href="test_php.jsp" style="margin-right: 10px;">php</a>
            <a href="test_python.jsp" style="margin-right: 10px;">python</a>
         
        </span>
    </center>
    </body>
</html>
