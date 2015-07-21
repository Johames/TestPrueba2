/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modelo.usuarioDaoImpl;

import java.sql.Connection;
import java.sql.Statement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import test.modelo.entidad.Usuario;
import test.modelo.usuarioDao.UsuarioDao;
import test.modelo.util.HibernateUtil;

/**
 *
 * @author TOSHIBA
 */
public class UsuarioDaoImpl implements UsuarioDao {

    public Connection abrirConexion() {
        return test.modelo.util.ConexionMysql.conectar();
    }

    public void cerrarConexion() {
        try {
            test.modelo.util.ConexionMysql.conectar();
        } catch (Exception e) {
        }
    }

    public void guardar() {
        try {
            abrirConexion().commit();
        } catch (Exception e) {
        }
    }

    public void revertir() {
        try {
            abrirConexion().rollback();
        } catch (Exception e) {
        }
    }

    @Override
    public boolean AgregarUsuario(Usuario usuario) {
        boolean stado = false;
        Statement st = null;
        String query = "insert into usuario (id, nombres, nacimiento, email, genero) values('" + usuario.getId() + "', '" + usuario.getNombres() + "', '" + usuario.getNacimiento() + "', '" + usuario.getEmail() + "', '" + usuario.getGenero() + "') ";
        try {
            st = abrirConexion().createStatement();
            st.executeUpdate(query);
            guardar();
            cerrarConexion();
            st.close();
            stado = true;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                revertir();
                cerrarConexion();
                st.close();
                stado = false;
            } catch (Exception ex) {
            }
        }
        return stado;
    }

    @Override
    public boolean updateusuario(Usuario usuario) {
        boolean flat = false;
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            Usuario u = (Usuario) session.get(Usuario.class, usuario.getId());
            u.setNombres(usuario.getNombres());
            u.setNacimiento(usuario.getNacimiento());
            u.setEmail(usuario.getEmail());
            u.setGenero(usuario.getGenero());
            session.update(u);
            tx.commit();
            session.close();
            flat = true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            tx.rollback();
            session.close();
            sf.close();
            flat = false;
        }
        return flat;
    }
}
