import java.util.ArrayList;

public class Concierto extends Evento{

	private Boolean permitidoGrabar;
	private TipoConcierto tipoConcierto;
	
	public Concierto(String nombre, Double cost, char tipoPublico, TipoConcierto tipoConcierto ,Boolean permitidoGrabar){
		super(nombre,cost, tipoPublico);
		this.permitidoGrabar = permitidoGrabar;
		this.tipoConcierto = tipoConcierto;
	}
	
	/*
	public void setPermitidoGrabar(Boolean permitidoGrabar){
		this.permitidoGrabar = permitidoGrabar;
	}
	public Boolean getPermitidoGrabar(){
		 return this.permitidoGrabar;
	}
	public void setTipoConcierto(TipoConcierto tipoConcierto){
		this.tipoConcierto = tipoConcierto;
	}
	public TipoConcierto getTipoConcierto(){
		 return this.tipoConcierto;
	}
	*/
	
	@Override
	public String devolverDatos(){
		String retu = super.devolverCabecera();
		retu+="CONCIERTO - TIPO: " + this.tipoConcierto + "\n";
		retu+="PERMISO GRABACION: ";
		if (permitidoGrabar){
			retu+= "SI\n";
		}else{
			retu+= "NO\n";
		}
		return retu;
		
	}	
}
