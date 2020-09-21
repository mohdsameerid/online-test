

package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "delete", urlPatterns = {"/delete"})
public class delete extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet delete</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("");
            try{
              Connection con=Dbconnection.getConncetion();
              int p = 0;
                
              for( int i=1;i<=100;i++){
              String values=request.getParameter("r"+i);
             
                if(values==null){                    
                }
                else{
                    PreparedStatement ps=con.prepareStatement("delete from QUESTIONINSERT where Serial_no=?");
                    ps.setString(1, values);
                     p=ps.executeUpdate();
                  }
               }  
                if(p>0){
                    out.println("<div><h4><a href='welcome1.jsp' style='float: left;'>Home</a></h4></div>");
                    out.println("<div><h3><a href='#' style='float: right;'>Logout</a></h3></div>");
                out.println("<center><h1>Online Test System</h1>");
                out.println("<table><tr><td><h4>Record Deleted Sccessfully</h4></td> <td> <a href='deleteservlet'>more data delete ?</a></td></table>");
                out.println("</center>");
                }
                else{
                   response.sendRedirect("error_4.jsp");
                 }
              
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
