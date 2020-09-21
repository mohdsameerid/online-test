
package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "deleteservlet", urlPatterns = {"/deleteservlet"})
public class deleteservlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style> .vertical {  border-left: 2px solid black;  height: 407.5%;  position: absolute; left: 88%; margin-left: -3px; top: 0; ");
            
            out.println("</style>");
            out.println("<title>Servlet deleteservlet</title>");    
            
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>");
            out.println(" <script>\n" +
"$(document).ready(function(){\n" +
"  $(\"#hide\").click(function(){\n" +
"    $(\"p\").hide();\n" +
"  });\n" +
"  $(\"#show\").click(function(){\n" +
"    $(\"p\").show();\n" +
"  });\n" +
"});\n" +
"</script>");       
             
            out.println("</head>");
            out.println("<body>");
             
             try{
               Connection con=Dbconnection.getConncetion();
               String sql="select * from QUESTIONINSERT order by SERIAL_NO";
               PreparedStatement ps=con.prepareStatement(sql);
               ResultSet rs=ps.executeQuery();
               out.println("<form action='delete' method='post' ><hr>");
             
              
              int i=1;
              
              out.println("<table style='float: right;' ><tr><th><h4 style=' padding-bottom: 20px; font-weight: bold;font-size: 16px;'>Select to Delete<hr></th></tr></h4>");
              out.println("<div class='vertical'style='margin-top: 18px;'></div>");  
              while(rs.next()){
                   out.println("<tr><center><th><span style=' float: right; margin-left : 0px; padding: 52px;'><input type='checkbox' value='"+rs.getString("Serial_no")+"' name='r"+i+"' ></span></th></center></tr></table>");
                   
                   out.println("<h4>&nbsp;&nbsp;"+rs.getString("Serial_no")+". &nbsp;&nbsp;"+rs.getString("QUES")+"</h4>");
                   out.println("<button id='hide'>Hide </button>");
                   out.println("<button id='show'>Show </button>");
                   
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op1")+"' /></span>A.  "+rs.getString("op1")+"</p>");
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op2")+"' /></span>B.  "+rs.getString("op2")+"</p>"); 
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op3")+"' /></span>C.  "+rs.getString("op3")+"</p>");
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op4")+"' /></span>D.  "+rs.getString("op4")+"</p><hr>");
                   i++;
                   
                 }
              
                out.println("<span style='padding: 20px; '><center><input type='submit' value='Delete' style='font-size: 16px; color: green;' /></center></span>");
                out.println("</form>");

               
            }
            catch(Exception e){
              e.printStackTrace();
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
