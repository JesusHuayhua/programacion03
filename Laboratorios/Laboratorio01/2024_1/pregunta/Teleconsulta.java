import java.util.Date;

public class Teleconsulta extends CitasMedicas {

	private Plataforma plataforma;
	private String enlance;

	public Teleconsulta(Paciente paciente, Medico medico,Date fechaHoraAtencion,String motivo, Plataforma plataforma, String enlance ){
		super(paciente,medico, fechaHoraAtencion,motivo);
		this.plataforma = plataforma;
		this.enlance = enlance;
	}
	
	public void setPlataforma(Plataforma plataforma){
		this.plataforma = plataforma;
	}
	public Plataforma getPlataforma(){
		 return this.plataforma;
	}
	public void setEnlance(String enlance){
		this.enlance = enlance;
	}
	public String getEnlance(){
		 return this.enlance;
	}

}
