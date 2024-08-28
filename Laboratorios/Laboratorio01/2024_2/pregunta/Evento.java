import java.util.ArrayList;

public abstract class Evento implements InfoProvider, IDataProvider{

	private String nombre;
	private Double cost;
	private char tipoPublico;
	private Integer idEvento;
	private static Integer correlativo = 1;
	private Local local;
	private ArrayList<Funcion> funciones;
	private ArrayList<Artista> participantes;
	
	public Evento( String nombre, Double cost, char tipoPublico){
		this.nombre = nombre;
		this.cost = cost;
		this.tipoPublico = tipoPublico;
		this.idEvento = this.correlativo++;
		funciones = new ArrayList<Funcion>();
		participantes = new ArrayList<Artista>();
	}
	
	
	public void setLocal(Local local){
		this.local = local;
	}
	/*
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		 return this.nombre;
	}
	public void setCost(Double cost){
		this.cost = cost;
	}
	public Double getCost(){
		 return this.cost;
	}
	public void setTipoPublico(char tipoPublico){
		this.tipoPublico = tipoPublico;
	}
	public char getTipoPublico(){
		 return this.tipoPublico;
	}
	public void setIdEvento(Integer idEvento){
		this.idEvento = idEvento;
	}
	public Integer getIdEvento(){
		 return this.idEvento;
	}
	*/
	
	public void agregarArtista(Artista participante){
		this.participantes.add(participante);
	}
	
	public void agregarFuncion(Funcion funcion){
		this.funciones.add(funcion);
	}
	
	
	public abstract String devolverDatos();

	public String devolverCabecera(){
		String cabecera="EVENTO Nro. " + idEvento.toString() + "\n";
		cabecera+="==================================================\n";
		Integer num = 1;
		for (Artista a : participantes){
			cabecera+= "NOMBRE: " + this.nombre + " - TIPO PUBLICO: " +  this.tipoPublico + "\n";
			cabecera+= "Artista " + num.toString() + ": ARTISTA: " + a.getNombre();
			num++;
		}
		cabecera+="LOCAL: " + this.local.getNombre() + "- CAPACIDAD: " + this.local.getCapacidad() + "\n";
		num = 1;
		for (Funcion f : funciones ){
			cabecera+="FUNCION " + num.toString() + ": FECHA: " + f.getFecha().toString() +" "+ f.getHora().toString() + "\n";
			num++;
 		}
		return cabecera;
	}
}
