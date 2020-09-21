<%-- 
    Document   : login1.jsp
    Created on : Mar 9, 2019, 4:39:49 PM
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
        <h2>Login User</h2>
<form method="post" action="loginserlet" >
  
      <table>
          <tr>
              <th>Enter Full Name : </th><td><input type="text" name="t1"/></td>
          </tr>
           <tr>
               <th>Enter Password : </th><td><input type="password" name="t2"/></td>
          </tr>
          <tr>
              <td><input type="submit" value="Login"/></td>
              <td><a href="registeration.jsp">Registeration ?</a></td>
              <td><a href="index.html">back</a></td>
          </tr>
      </table>
  
</form>
    </center>
    </body>
</html>
