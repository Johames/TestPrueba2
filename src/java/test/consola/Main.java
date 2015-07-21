/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.consola;

import test.modelo.entidad.Usuario;
import test.modelo.usuarioDao.UsuarioDao;
import test.modelo.usuarioDaoImpl.UsuarioDaoImpl;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        
        main.agregar();
    }
    
    public void agregar(){
        UsuarioDao dao = new UsuarioDaoImpl();
        Usuario user = new Usuario();
        
        user.setId("766120680153463");
        user.setNombres("Johann James Valles Paz");
        user.setNacimiento("24/09/1994");
        user.setEmail("johames.15@gmail.com");
        user.setGenero("male");
        
        if(dao.AgregarUsuario(user)){
            System.out.println("Se Agregó Correctamente");
        }else{
            System.out.println("Ocurrió un error al Agregar");
        }
    }
    
}
