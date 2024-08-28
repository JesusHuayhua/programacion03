import java.util.ArrayList;

public class Productora {

	private String nombre;
	private ArrayList<Evento> eventos;
	
	public Productora(  String nombre ){
		this.nombre = nombre;
		this.eventos = new ArrayList<Evento>();
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		 return this.nombre;
	}
	public void agregarEvento(Evento evento){
			this.eventos.add(evento);
	}
	
	public String consultarDatosEvento(int indice){
		// En caso no tengamos eventos insertados
		if ( eventos.size() == 0 ){
			return "";
		}
		return this.eventos.get(indice).devolverDatos();
	}
	public String consultarObrasTeatrales(){
		if ( eventos.size() == 0 ){
			return "";
		}
		String retu="";
		for (Evento e : eventos){
			if (e instanceof ObraTeatral ){
				retu += e.devolverDatos();
			}
		}
		return retu;
	}
}
