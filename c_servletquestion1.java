
package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static oracle.net.aso.C11.s;


@WebServlet(name = "c_servletquestion1", urlPatterns = {"/c_servletquestion1"})
public class c_servletquestion1 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
             out.println("<link rel='stylesheet' href='css/viewStyle.css'>");
            out.println("<title>Servlet c_servletquestion1</title>");            
            out.println("</head>");
            out.println("<body>");
             try{                            
                 Connection con=Dbconnection.getConncetion();
                 int k=0,n=0;
                
		  
                 String sql="select * from QUESTIONINSERT order by SERIAL_NO";
                 PreparedStatement ps=con.prepareStatement(sql);
                 ResultSet rs=ps.executeQuery(); 
                 int i=1,j=0;
                 while(rs.next()){
                    String option=request.getParameter("option"+i+"");
                    String coans=rs.getString(7);
                   
                    if(option==null){
                       n=n+1;                    
                    }
                    else if(option.equals(coans)){
                      k=k+1;
                    }
                    else{
                       
                    }
                     i++;
                     j++;
                  }
                 int g=j-n;
                     
                     out.println("<center><table id='table_view'>");
                     out.println("<tr><th colspan='5'>Marks : "+k+" / "+j+"</th></tr>");
                     out.println("<tr><th style='float:left;'>Total number of questions </th> <th>"+j+"</th></tr>");
                     out.println("<tr><th style='float:left;'>Number of answered questions </th><th> "+g+"</th></tr>");
                     out.println("<tr><th style='float:left;'>Unanswered ques </th> <th>"+n+"</th></tr>");
                     out.println("</table></center>");    
                     
                 String sqli="select * from QUESTIONINSERT order by SERIAL_NO";
                 PreparedStatement pstmt=con.prepareStatement(sqli);
                 ResultSet rset=pstmt.executeQuery(); 
                 
                 while(rset.next()){
                   out.println("<h4>&nbsp;&nbsp;"+rs.getString("Serial_no")+". &nbsp;&nbsp;"+rs.getString("QUES")+"</h4>");
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op1")+"' /></span>A.  "+rs.getString("op1")+"</p>");
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op2")+"' /></span>B.  "+rs.getString("op2")+"</p>"); 
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op3")+"' /></span>C.  "+rs.getString("op3")+"</p>");
                   out.println(" <p><span style='margin-right: 10px;'><input type='radio' name='option"+i+"'  value='"+rs.getString("op4")+"' /></span>D.  "+rs.getString("op4")+"</p><hr>");
                   
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
