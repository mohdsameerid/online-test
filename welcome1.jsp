<%-- 
    Document   : welcome1.jsp
    Created on : Mar 9, 2019, 5:26:03 PM
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
        <div><p style="float: left; margin: 0px; font-weight: bold; font-size: 23px;"><a href="welcome1.jsp">Home</a></p> </div>
        <div style="margin: 0px;"><h1 style="text-align: center;"><%=request.getAttribute("admin")%> Dassboard <br></h1>  </div>
      <center>
        <section style="  height: 80px; margin-left: 18%; "> 
              
          <div style="width: 15%; height: 198px; float: left; margin-left: 50px; border-radius:5px 5px 0px 0px; border:2px solid grey;padding: 15px;">
            <h3>
                 Submit Questions
            </h3><hr>
            <table border="1" >
                <tr>
                    <th><a href="c.jsp" style="margin: 10px;">C/C++</a><br></th>
                </tr>
                <tr>
                    <th><a href="java.jsp" style="margin: 10px;">Java</a><br></th>
                </tr>
                <tr>
                    <th><a href="php.jsp" style="margin: 10px;">Php</a><br></th>
                </tr>
                <tr>
                    <th><a href="python.jsp">Python</a><br></th>
                </tr>               
            </table>
          </div>
          <div style="width: 15%; height: 198px; float: left; margin-left: 50px; border-radius:5px 5px 0px 0px; border:2px solid grey; padding: 15px;">
            <h3>
               Operations
            </h3><hr>
            <table border="1">
                <tr>
                    <th><a href="delete.jsp" style="margin: 10px;">Delete</a><br></th>
                </tr>
                <tr>
                    <th><a href="updateservlet.jsp" style="margin: 10px;">Update</a><br></th>
                </tr>                             
            </table>
          </div>
          <div style="width: 15%; height: 198px; float: left; margin-left: 50px; border-radius:5px 5px 0px 0px; border:2px solid grey; padding: 15px;">
            <h3>
               User view 
            </h3><hr>
                <table border="1" style="">
                <tr>
                    <th><a href="#" style="margin: 15px;">C/C++</a><br></th>
                </tr>
                <tr>
                    <th><a href="#" style="margin: 15px;">Java</a><br></th>
                </tr>
                <tr>
                    <th><a href="#" style="margin: 15px;">Php</a><br></th>
                </tr>
                <tr>
                    <th><a href="#">Python</a><br></th>
                </tr>               
            </table>
          </div>
            
        </section>
    </center>
        
    </body>
</html>
