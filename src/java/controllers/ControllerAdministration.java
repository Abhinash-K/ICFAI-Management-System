
package controllers;

import daos.DaoAdministration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControllerAdministration extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            boolean res=false;
            DaoAdministration da = new DaoAdministration();
            String action = request.getParameter("action");
            System.out.println("action : "+action);
            switch(Integer.valueOf(action))
            {
                case 1: res=da.insertUsers(request);
                        response.sendRedirect("manageuser.jsp");
                        break;
                case 2: res=da.enbdisUser(request,"N");
                        response.sendRedirect("manageuser.jsp");
                        break;
                case 3: res=da.enbdisUser(request,"Y");
                        response.sendRedirect("manageuser.jsp");
                        break;
                case 4: {
                            Integer usercode = Integer.valueOf(request.getParameter("usercode").trim());
                            String userpassword = "abc@123";
                            res=da.resetPassword(usercode,userpassword);   
                        }
                        response.sendRedirect("manageuser.jsp");
                        break;
                case 5: {
                            Integer usercode = (Integer)request.getSession().getAttribute("usercode");
                            String userpassword = request.getParameter("userpassword").trim();
                            res=da.resetPassword(usercode,userpassword);  
                            response.sendRedirect("success.jsp?opt=1");
                        }break;
                case 6: res=da.insertStudentdetails(request);      
                        if(res){
                            response.sendRedirect("success.jsp?opt=2");
                        }else{
                            response.sendRedirect("success.jsp?opt=3");
                        }
                        break;    
                case 7: res=da.enbdisUser(request,"Y");
                        response.sendRedirect("stconformation.jsp");
                        break;
                case 8: res=da.promote(request);
                        String regyear = request.getParameter("regyear");
                        String ccode = request.getParameter("ccode");
                        String scode = request.getParameter("scode");
                        String url="stdpromote.jsp?coursecode="+ccode+"&semistercode="+scode+"&regyear="+regyear;
                        response.sendRedirect(url);
                        break;
                case 9: res=da.insertMarks(request);
                        regyear = request.getParameter("regyear");
                        ccode = request.getParameter("ccode");
                        scode = request.getParameter("scode");
                        url="stdmarks.jsp?coursecode="+ccode+"&semistercode="+scode+"&regyear="+regyear;
                        response.sendRedirect(url);
                        break;                    
            }    

            if(Integer.valueOf(action) ==5){
                response.sendRedirect("success.jsp?opt=1");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("\nError in ControllerInitialization : "+e);
        }finally{
            out.close();
        } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
