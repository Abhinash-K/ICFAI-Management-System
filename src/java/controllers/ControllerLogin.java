
package controllers;

import daos.DaoAdministration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modles.TUserlogin;

public class ControllerLogin extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            DaoAdministration da = new DaoAdministration();
            String userid = request.getParameter("userid");
            String userpassword = request.getParameter("userpassword");
            TUserlogin ul = da.checkLogin(userid,userpassword);
            if(ul.getRoles()!=null){
                request.getSession().setAttribute("usercode", ul.getUsercode());
                request.getSession().setAttribute("userid", ul.getUserid());
                request.getSession().setAttribute("username", ul.getUserfname()+" "+ul.getUserlname());
                request.getSession().setAttribute("role", ul.getRoles());
                response.sendRedirect("home.jsp"); 
            }else{
                response.sendRedirect("accessdeny.jsp"); 
            }
        } finally {            
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
