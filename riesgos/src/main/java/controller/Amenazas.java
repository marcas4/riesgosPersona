package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import modelo.Escenario;

public class Amenazas{

	private Map<String, String> amenazas = new LinkedHashMap<>();
	
	 private Map<String, String> readParametros(String filePath) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Separamos la línea en clave y valor
	                String[] parts = line.split("=", 2);
	                if (parts.length >= 2) {
	                    String key = parts[0].trim();
	                    String value = parts[1].trim();
	                    amenazas.put(key, value);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return amenazas;
	    }
		
 
	 public Map<String, String> generarAmenazas(){
		  // Iterar sobre los nombres de las propiedades
		 String filePath = "src/main/resources/parametros.properties";
	     amenazas = readParametros(filePath);
	     return amenazas;
	}
	
	public Amenazas(String pregunta) {
		// TODO Auto-generated constructor stub
	}

	public Amenazas() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, String> getAmenazas() {
		return amenazas;
	}
	
	public String getPreguntaAmanazas(String key) {
		return amenazas.get(key);
	}

	public void setAmenazas(Escenario escenario) {
		this.amenazas.put(escenario.getPregunta(), escenario.getRespuesta());
	}
	
	public void setRespuestasAmenazas(String pregunta, String respuesta) {
		this.amenazas.put(pregunta, respuesta);
	}
	
}
