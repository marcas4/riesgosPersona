package modelo;

import controller.EscenariosDeRiesgos;

public class Escenario extends EscenariosDeRiesgos{
	private String pregunta;
	private String respuesta;
	/**
	 * @param pregunta
	 */
	public Escenario(String pregunta) {
		super();
		this.pregunta = pregunta;
	}
	
	public Escenario(){
		super();
		this.pregunta = pregunta;
	}
	
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
	

}
