package negocio;
// Generated 19-jun-2013 18:45:24 by Hibernate Tools 3.2.1.GA



/**
 * HorariopistaId generated by hbm2java
 */
public class HorariopistaId  implements java.io.Serializable {


     private int idHorario;
     private int idPista;

    public HorariopistaId() {
    }

    public HorariopistaId(int idHorario, int idPista) {
       this.idHorario = idHorario;
       this.idPista = idPista;
    }
   
    public int getIdHorario() {
        return this.idHorario;
    }
    
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    public int getIdPista() {
        return this.idPista;
    }
    
    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HorariopistaId) ) return false;
		 HorariopistaId castOther = ( HorariopistaId ) other; 
         
		 return (this.getIdHorario()==castOther.getIdHorario())
 && (this.getIdPista()==castOther.getIdPista());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdHorario();
         result = 37 * result + this.getIdPista();
         return result;
   }   


}


