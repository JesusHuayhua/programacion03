
abstract public class Persona implements IConsultable {

	 protected String DNI;
	 protected String nombre;
	 protected String apellidoPaterno;
	 protected String apellidoMaterno;

	public Persona(  String DNI, String nombre, String  apellidoPaterno, String   apellidoMaterno ){
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	// public void setDNI(String DNI){
	// 	this.DNI = DNI;
	// }
	// public String getDNI(){
	// 	 return this.DNI;
	// }
	// public void setNombre(String nombre){
	// 	this.nombre = nombre;
	// }
	// public String getNombre(){
	// 	 return this.nombre;
	// }
	// public void set apellidoPaterno(String  apellidoPaterno){
	// 	this. apellidoPaterno =  apellidoPaterno;
	// }
	// public String get apellidoPaterno(){
	// 	 return this. apellidoPaterno;
	// }
	// public void set  apellidoMaterno(String   apellidoMaterno){
	// 	this.  apellidoMaterno =   apellidoMaterno;
	// }
	// public String get  apellidoMaterno(){
	// 	 return this.  apellidoMaterno;
	// }
	public abstract String devolverInformacion();
}
