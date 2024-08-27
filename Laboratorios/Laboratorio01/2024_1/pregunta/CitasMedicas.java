import java.util.Date;
abstract public class CitasMedicas extends AtencionMedica {

	private String motivo;

	public CitasMedicas(Paciente paciente, Medico medico,Date fechaHoraAtencion, String motivo ){
		super(paciente,medico,fechaHoraAtencion);
		this.motivo = motivo;
	}
	

}
