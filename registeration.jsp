<%-- 
    Document   : login.jsp
    Created on : Mar 8, 2019, 10:46:30 PM
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
<h2>Online Test Registeration</h2>
<form method="post" action="RegisterationServlet" >
      <table>
          <tr>
              <th>Enter Full Name : </th><td><input type="text" name="t1"/></td>
          </tr>
          <tr>
               <th>Enter Email_id : </th><td><input type="text" name="t2"/></td>
          </tr>
           <tr>
               <th>Enter Password : </th><td><input type="password" name="t3"/></td>
          </tr>
          
          <tr>
              <td><input type="submit" value="Submit"/></td>
              <td><a href="login1.jsp">Login</a></td>
              <td><a href="login1.jsp">back</a></td>
          </tr>
      </table>
  
</form>
</center>
    </body>
</html>

