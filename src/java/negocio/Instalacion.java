package negocio;
// Generated 19-jun-2013 18:45:24 by Hibernate Tools 3.2.1.GA



/**
 * Instalacion generated by hbm2java
 */
public class Instalacion  implements java.io.Serializable {


     private Integer idInstalacion;
     private String direccion;
     private String nombre;

    public Instalacion() {
    }

    public Instalacion(String direccion, String nombre) {
       this.direccion = direccion;
       this.nombre = nombre;
    }
   
    public Integer getIdInstalacion() {
        return this.idInstalacion;
    }
    
    public void setIdInstalacion(Integer idInstalacion) {
        this.idInstalacion = idInstalacion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


