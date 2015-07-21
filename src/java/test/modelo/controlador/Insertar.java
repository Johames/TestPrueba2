/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modelo.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.modelo.entidad.Usuario;
import test.modelo.usuarioDao.UsuarioDao;
import test.modelo.usuarioDaoImpl.UsuarioDaoImpl;

/**
 *
 * @author TOSHIBA
 */
public class Insertar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioDao dao = new UsuarioDaoImpl();
        Usuario usuario = new Usuario();
            
        String action = request.getParameter("action"); action = action == null?"":action;
        String nombres = request.getParameter("nombres"); nombres = nombres == null?"":nombres;
        String id = request.getParameter("id"); id = id == null?"":id;
        String nacimiento = request.getParameter("nacimiento"); nacimiento = nacimiento == null?"":nacimiento;
        String email = request.getParameter("email"); email = email == null?"":email;
        String genero = request.getParameter("genero"); genero = genero == null?"":genero;
            
            switch(action){
                case "insertar":
                    usuario.setNombres(nombres);
                usuario.setId(id);
                usuario.setNacimiento(nacimiento);
                usuario.setEmail(email);
                usuario.setGenero(genero);
                
                if(dao.AgregarUsuario(usuario)){
                    request.getRequestDispatcher("test.jsp").forward(request, response);
                }else{
                    request.getRequestDispatcher("test.jsp").forward(request, response);
                }
                    break;
                default:
                    break;
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
