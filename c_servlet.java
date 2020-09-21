
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


@WebServlet(name = "c_servlet", urlPatterns = {"/c_servlet"})
public class c_servlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet c_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
             try{
               Connection con=Dbconnection.getConncetion();
               String ques=request.getParameter("t1");
               String op1=request.getParameter("t2");
               String op2=request.getParameter("t3");
               String op3=request.getParameter("t4");
               String op4=request.getParameter("t5");
               String coans=request.getParameter("t6");
               String sql="insert into QUESTIONINSERT values((select max(serial_no)+1 from QUESTIONINSERT),?,?,?,?,?,?)";
               PreparedStatement ps=con.prepareStatement(sql);
               ps.setString(1,ques);
               ps.setString(2,op1);
               ps.setString(3,op2);
               ps.setString(4,op3);
               ps.setString(5,op4);
               ps.setString(6,coans);
               int p=ps.executeUpdate();
               if(p>0){
                  response.sendRedirect("Successfully.jsp");
               }
               else{
                  response.sendRedirect("error_3.jsp");
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
