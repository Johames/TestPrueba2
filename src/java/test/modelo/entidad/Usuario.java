package test.modelo.entidad;
// Generated 21/07/2015 09:22:09 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String id;
     private String nombres;
     private String nacimiento;
     private String email;
     private String genero;
     private Date fecha;

    public Usuario() {
    }

	
    public Usuario(String id) {
        this.id = id;
    }
    public Usuario(String id, String nombres, String nacimiento, String email, String genero, Date fecha) {
       this.id = id;
       this.nombres = nombres;
       this.nacimiento = nacimiento;
       this.email = email;
       this.genero = genero;
       this.fecha = fecha;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getNacimiento() {
        return this.nacimiento;
    }
    
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}

