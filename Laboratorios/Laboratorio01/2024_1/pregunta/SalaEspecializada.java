
public class SalaEspecializada extends AmbienteClinico{

	private String nombre;
	private Boolean poseeImagenologia;

	public SalaEspecializada(  Double espacio, char torre, Integer piso,String nombre, Boolean poseeImagenologia ){
		super(  espacio, torre,piso);
		this.nombre = nombre;
		this.poseeImagenologia = poseeImagenologia;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		 return this.nombre;
	}
	public void setPoseeImagenologia(Boolean poseeImagenologia){
		this.poseeImagenologia = poseeImagenologia;
	}
	public Boolean getPoseeImagenologia(){
		 return this.poseeImagenologia;
	}

}
