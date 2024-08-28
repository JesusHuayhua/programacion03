import java.util.ArrayList;

public class ObraTeatral extends Evento {

	private Integer numero_de_actos;
	private Boolean requiereEscenografia;
	//("YO CINNA",5500.00,'A',5,true);
	public ObraTeatral( String nombre, Double cost, char tipoPublico, Integer numero_de_actos, Boolean requiereEscenografia ){
		super(nombre,cost,tipoPublico);
		this.numero_de_actos = numero_de_actos;
		this.requiereEscenografia = requiereEscenografia;
	}
	/*
	public void setNumero_de_actos(Integer numero_de_actos){
		this.numero_de_actos = numero_de_actos;
	}
	public Integer getNumero_de_actos(){
		 return this.numero_de_actos;
	}
	public void setRequiereEscenografia(Boolean requiereEscenografia){
		this.requiereEscenografia = requiereEscenografia;
	}
	public Boolean getRequiereEscenografia(){
		 return this.requiereEscenografia;
	}
	*/
	
	@Override
	public String devolverDatos(){
		String retu = super.devolverCabecera();
		retu+="OBRA TEALTRA - NUM. ACTOS: " + this.numero_de_actos+ "\n";
		retu+="REQ ESCENOGRAFIA : ";
		if (requiereEscenografia){
			retu+= "SI\n";
		}else{
			retu+= "NO\n";
		}
		return retu;
		
	}
}
