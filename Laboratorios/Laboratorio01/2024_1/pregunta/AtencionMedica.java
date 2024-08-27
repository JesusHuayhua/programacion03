import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;

abstract public class AtencionMedica {

	protected static Integer correlativo = 1;
	protected Integer idAtencionMedica;
	protected Paciente paciente;
	protected Medico medico;
	protected Date fechaHoraCreacion;
	protected Date fechaHoraAtencion;
	protected EstadoAtencion estado;

	public AtencionMedica(Paciente paciente, Medico medico, Date fechaHoraAtencion ){
		this.idAtencionMedica = this.correlativo++;
		this.paciente = paciente;
		this.medico = medico;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraAtencion = fechaHoraAtencion;
		this.estado = EstadoAtencion.PROGRAMADA;
	}
	
	// public void setIdAtencionMedica(Integer idAtencionMedica){
	// 	this.idAtencionMedica = idAtencionMedica;
	// }
	// public Integer getIdAtencionMedica(){
	// 	 return this.idAtencionMedica;
	// }
	// public void setPaciente(Paciente paciente){
	// 	this.paciente = paciente;
	// }
	// public Paciente getPaciente(){
	// 	 return this.paciente;
	// }
	// public void setMedico(Medico medico){
	// 	this.medico = medico;
	// }
	// public Medico getMedico(){
	// 	 return this.medico;
	// }
	// public void setFechaHoraCreacion(Date fechaHoraCreacion){
	// 	this.fechaHoraCreacion = fechaHoraCreacion;
	// }
	// public Date getFechaHoraCreacion(){
	// 	 return this.fechaHoraCreacion;
	// }
	// public void setFechaHoraAtencion(Date fechaHoraAtencion){
	// 	this.fechaHoraAtencion = fechaHoraAtencion;
	// }
	// public Date getFechaHoraAtencion(){
	// 	 return this.fechaHoraAtencion;
	// }
	// public void setEstado(EstadoAtencion estado){
	// 	this.estado = estado;
	// }
	// public EstadoAtencion getEstado(){
	// 	 return this.estado;
	// }

}
