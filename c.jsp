<%-- 
    Document   : ques.jsp
    Created on : Mar 9, 2019, 5:33:54 PM
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
        <center style="margin-bottom: ">
        <h2>Admin Insert Question on C/C++</h2>
        <form action="c_servlet" method="post">
        <table>
            <tr>
                <td>Question</td><td><input type="text" name="t1" size="45" style="height: 40px;"/></td>
            </tr>
            <tr>
                <td>1.</td><td><input type="text" name="t2" size="40" style="height: 35px;"/></td>
            </tr>
            <tr>
                <td>2.</td><td><input type="text" name="t3" size="40" style="height: 35px;"/></td>
            </tr>
            <tr>
                <td>3.</td><td><input type="text" name="t4" size="40" style="height: 35px;"/></td>
            </tr>
            <tr>
                <td>4.</td><td><input type="text" name="t5" size="40" style="height: 35px;"/></td>
            </tr>
            <tr>
                <td>Correct Ans.</td><td><input type="text" name="t6" size="40" style="height: 35px;"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td><td><a href="welcome1.jsp">back</a></td>
            </tr>
        </table>
        </form>
    </center>
    </body>
</html>
