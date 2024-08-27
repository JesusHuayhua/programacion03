import java.util.Date;
public class ExamenDiagnostico extends AtencionMedica{

	private SalaEspecializada salaEspecialidad;
	private TipoExamen tipoExamen;

	public ExamenDiagnostico( Paciente paciente, Medico medico,Date fechaHoraAtencion,  SalaEspecializada salaEspecialidad, TipoExamen tipoExamen ){
		super(paciente,medico,fechaHoraAtencion);
		this.salaEspecialidad = salaEspecialidad;
		this.tipoExamen = tipoExamen;
	}
	// public void setSalaEspecialidad(SalaEspecialidad salaEspecialidad){
	// 	this.salaEspecialidad = salaEspecialidad;
	// }
	// public SalaEspecialidad getSalaEspecialidad(){
	// 	 return this.salaEspecialidad;
	// }
	// public void setTipoExamen(TipoExamen tipoExamen){
	// 	this.tipoExamen = tipoExamen;
	// }
	// public TipoExamen getTipoExamen(){
	// 	 return this.tipoExamen;
	// }

}
