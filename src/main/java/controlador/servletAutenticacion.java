/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;


import com.modelo.Cuenta.GestorAutenticacion;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author misae
 */
public class servletAutenticacion extends HttpServlet {
    GestorAutenticacion autenticacion = new GestorAutenticacion();
    RequestDispatcher rd;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*   @Override
  public void init() throws ServletException{
      String jdbcURL= getServletContext().getInitParameter("jdbcURL");
      String jdbcUserName = getServletContext().getInitParameter("jdbcUserName");
      String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
      
  }*/

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletAuten</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAuten at " + request.getContextPath() + "</h1>");
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
               
                String action=request.getParameter("action");
                 if(action.equals("login")){
                    try {
                        login(request,response);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(servletAutenticacion.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(servletAutenticacion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

    }

    protected void login(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException, ClassNotFoundException, SQLException {

            HttpSession session = request.getSession();
            
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            String logged = autenticacion.getConfirmarCredenciales(usuario, password);


           

        if(null != logged){

            switch (logged) {
            case "cliente":
                
                String text = autenticacion.getNombreCliente();
                request.setAttribute("message", text);
                rd = request.getRequestDispatcher("/portal-cliente.jsp");
                rd.forward(request, response);
                break;
            case "gerente":
                rd = request.getRequestDispatcher("/portal-admin.jsp");
                rd.forward(request, response);
                break;
            case "cocinero":

                rd = request.getRequestDispatcher("/portal-cocinero.jsp");
                rd.forward(request, response);
                
                break;
            case "repartidor":
                rd = request.getRequestDispatcher("/portal-repartidor.jsp");
                rd.forward(request, response);
                break;
            case "mesero":
                rd = request.getRequestDispatcher("/portal-mesero.jsp");
                rd.forward(request, response);
                break;
            case "ninguno":
                String msg = "Credenciales incorrectas";
                request.setAttribute("message", msg);
                rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
                break;
            default:
                break;
        }       
            
            /*String msg = autenticacion.getNombreCliente();*/
            
        }

        
                    /* Este código nos permite verificar el paso de parametros usuario y password
            
            */
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletAuten</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Utilizando servletAuten</h1>");
            out.println("<p>usuario: "  + usuario  +"</p>");
            out.println("<p>password: " + password +"</p>");
            out.println("<p>tipo de cuenta: " + logged + "</p>");
            out.println("</body>");
            out.println("</html>");
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
