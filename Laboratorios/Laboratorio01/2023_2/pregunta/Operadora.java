
public class Operadora {

	private String nombre;
	private Boolean monitoreo;
	private Boolean logistica;

	public Operadora(  String nombre, Boolean monitoreo, Boolean logistica ){
		this.nombre = nombre;
		this.monitoreo = monitoreo;
		this.logistica = logistica;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		 return this.nombre;
	}
	public void setMonitoreo(Boolean monitoreo){
		this.monitoreo = monitoreo;
	}
	public Boolean getMonitoreo(){
		 return this.monitoreo;
	}
	public void setLogistica(Boolean logistica){
		this.logistica = logistica;
	}
	public Boolean getLogistica(){
		 return this.logistica;
	}

}
