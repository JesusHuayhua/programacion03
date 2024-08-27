
public class Consultorio extends AmbienteClinico{

	private String numero_de_consulta;

	public Consultorio( Double espacio, char torre, Integer piso,  String numero_de_consulta ){
		super(  espacio, torre,piso);
		this.numero_de_consulta = numero_de_consulta;
	}
	// public void setNumero_de_consulta(String numero_de_consulta){
	// 	this.numero_de_consulta = numero_de_consulta;
	// }
	// public String getNumero_de_consulta(){
	// 	 return this.numero_de_consulta;
	// }

}
