import java.util.ArrayList;

public class Paciente extends Persona{

	private Integer numeroHistoriaClinica;
	private ArrayList<AtencionMedica> atencionesMedicas;

	public Paciente(String DNI, String nombre, String  apellidoPaterno, String   apellidoMaterno, Integer numeroHistoriaClinica){
		super(DNI, nombre, apellidoPaterno,apellidoMaterno);
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	public void setAtencionesMedicas(ArrayList<AtencionMedica> atencionesMedicas){
		this.atencionesMedicas = atencionesMedicas;
	}
	public ArrayList<AtencionMedica> getAtencionesMedicas(){
		 return this.atencionesMedicas;
	}
	@Override
	public String devolverInformacion(){
		return "";
	}

}
