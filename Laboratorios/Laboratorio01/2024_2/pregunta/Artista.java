import java.util.ArrayList;

public class Artista {

	private String nombre;
	private String nacionalidad;
	private ArrayList<Artista> integrantes;

	public Artista(  String nombre, String nacionalidad ){
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		integrantes = new ArrayList<Artista>();
	}

	public String getNombre(){
		 return this.nombre;
	}
	public String getNacionalidad(){
		 return this.nacionalidad;
	}
	public void setIntegrantes(ArrayList<Artista> integrantes){
		this.integrantes = integrantes;
	}
	public ArrayList<Artista> getIntegrantes(){
		 return new ArrayList<Artista>(this.integrantes);
	}
	
	
	//===========================================
	// Funciones
	//===========================================
	public void agregarArtista(Artista nuevoIntegrante){
		integrantes.add(nuevoIntegrante);
	}

}
