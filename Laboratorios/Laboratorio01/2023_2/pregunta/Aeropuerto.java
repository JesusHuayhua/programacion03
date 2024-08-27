public class Aeropuerto {

	private String nombre;
	private String direccion;

	public Aeropuerto(  String nombre, String direccion ){
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		 return this.nombre;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public String getDireccion(){
		 return this.direccion;
	}

}
