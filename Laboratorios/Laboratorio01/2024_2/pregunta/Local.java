
public class Local {

	private String nombre;
	private String direccion;
	private Integer capacidad;
	private TipoLocal tipoLocal;
	public Local(  String nombre, String direccion, Integer capacidad, TipoLocal tipoLocal ){
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.tipoLocal = tipoLocal;
	}

	public String getNombre(){
		 return this.nombre;
	}
	public String getDireccion(){
		 return this.direccion;
	}
	public Integer getCapacidad(){
		 return this.capacidad;
	}
	public TipoLocal getTipoLocal(){
		 return this.tipoLocal;
	}

}
