
public class Medico extends Persona{

	private String colegiatura;
	private String registroEspecialidad;
	private Especialidad especialidad;

	public Medico(  String DNI, String nombre, String  apellidoPaterno, String   apellidoMaterno,
		 Especialidad especialidad,String colegiatura, String registroEspecialidad){
		super(DNI, nombre, apellidoPaterno, apellidoMaterno);
		this.especialidad = especialidad;
		this.colegiatura = colegiatura;
		this.registroEspecialidad = registroEspecialidad;
	}
	@Override
	public String devolverInformacion(){
		return "";	
	}
}
