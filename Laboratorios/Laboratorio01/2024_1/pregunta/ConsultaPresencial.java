import java.util.Date;

public class ConsultaPresencial extends CitasMedicas{

	private Consultorio consultorio;
	private Boolean requiere_asistencia;

//ConsultaPresencial(pac01, med01, sdf.parse("29-03-2024 16:00"), "DOLOR DE ESPALDA", con01, false);
	public ConsultaPresencial( Paciente paciente, Medico medico,Date fechaHoraAtencion, String motivo,Consultorio consultorio, Boolean requiere_asistencia ){
		super(paciente,medico,fechaHoraAtencion, motivo);
		this.consultorio = consultorio;
		this.requiere_asistencia = requiere_asistencia;
	}
	public void setConsultorio(Consultorio consultorio){
		this.consultorio = consultorio;
	}
	public Consultorio getConsultorio(){
		 return this.consultorio;
	}
	public void setRequiere_asistencia(Boolean requiere_asistencia){
		this.requiere_asistencia = requiere_asistencia;
	}
	public Boolean getRequiere_asistencia(){
		 return this.requiere_asistencia;
	}

}
