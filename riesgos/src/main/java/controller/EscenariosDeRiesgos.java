package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import modelo.Escenario;

public class EscenariosDeRiesgos{


	private List<Escenario> riesgos = new ArrayList<>();
		
	public Properties cargarArchivoRiesgos () {
		Properties properties = new Properties();
		
		try {
	    	//properties.load(new BufferedReader(new FileReader("C:\\Users\\Marcia Castro\\git\\bootcampJava\\riesgos\\src\\main\\resources\\parametros.properties")));
	    	properties.load(new BufferedReader(new FileReader("src/main/resources/parametros.properties")));
		    } catch (IOException e) {
		      System.out.println(e);
		    }      
		
		return properties;
	}
	
	public List<Escenario> generarEscenariosDeRiesgo(Properties properties){
		
		  // Iterar sobre los nombres de las propiedades
        for (String key : properties.stringPropertyNames()) {
        	//String value = properties.getProperty(key);
        	Escenario escenario = new Escenario(properties.getProperty(key));
        	riesgos.add(escenario);
        }
	return riesgos;
	}
	
	public EscenariosDeRiesgos(String pregunta) {
		// TODO Auto-generated constructor stub
	}

	public EscenariosDeRiesgos() {
		// TODO Auto-generated constructor stub
	}

	public List<Escenario> getRiesgos() {
		return riesgos;
	}

	public void setRiesgo(Escenario escenario, String respuesta, Integer i) {
		
		escenario.setRespuesta(respuesta);
		this.riesgos.set(i, escenario);
	}

	
}
