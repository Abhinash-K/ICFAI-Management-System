
package controllers;

import daos.DaoLibrarymanagement;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControllerLibrary extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            boolean res=false;
            DaoLibrarymanagement dl = new DaoLibrarymanagement();
            String action = request.getParameter("action");
            System.out.println("action : "+action);
            switch(Integer.valueOf(action))
            {
                case 1: res=dl.insertBooks(request);
                        response.sendRedirect("initbooks.jsp");     
                        break;
                case 2: res=dl.issusBook(request);
                        if(res){
                            response.sendRedirect("success.jsp?opt=4");
                        }else{
                            response.sendRedirect("success.jsp?opt=5");
                        }
                        response.sendRedirect("issuebook.jsp"); 
                        break;
                case 3: res=dl.returnBook(request);
                        if(res){
                            response.sendRedirect("success.jsp?opt=6");
                        }else{
                            response.sendRedirect("success.jsp?opt=7");
                        }
                        response.sendRedirect("returnbook.jsp");         
                        break;
                
            }               
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("\nError in ControllerLibrary : "+e);
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
