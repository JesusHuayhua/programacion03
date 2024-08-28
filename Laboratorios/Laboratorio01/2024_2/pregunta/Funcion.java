import java.time.LocalTime;
import java.util.Date;

public class Funcion {

	private Date fecha;
	private LocalTime hora;

	public Funcion(  Date fecha, LocalTime hora ){
		this.fecha = fecha;
		this.hora = hora;
	}
	public Date getFecha(){
		 return this.fecha;
	}
	public LocalTime getHora(){
		 return this.hora;
	}

}
