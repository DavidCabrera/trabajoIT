package negocio;
// Generated 19-jun-2013 18:45:24 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Valoracion generated by hbm2java
 */
public class Valoracion  implements java.io.Serializable {


     private Integer idValoracion;
     private Integer idUsuario;
     private String descripcion;
     private Date fecha;
     private Integer idPista;

    public Valoracion() {
    }

    public Valoracion(Integer idUsuario, String descripcion, Date fecha, Integer idPista) {
       this.idUsuario = idUsuario;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.idPista = idPista;
    }
   
    public Integer getIdValoracion() {
        return this.idValoracion;
    }
    
    public void setIdValoracion(Integer idValoracion) {
        this.idValoracion = idValoracion;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getIdPista() {
        return this.idPista;
    }
    
    public void setIdPista(Integer idPista) {
        this.idPista = idPista;
    }




}


