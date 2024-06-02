package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class EscenariosDeRiesgos {
	
	private Map<String, Integer> escenarios = new LinkedHashMap<>();
	private Map<String, String> riesgos = new LinkedHashMap<>();
	
	 private Map<String, String> readRiesgos(String filePath) {
	        
		 Map<String, String> riesgos = new LinkedHashMap<>();
		 try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Separamos la línea en clave y valor
	                String[] parts = line.split("=", 2);
	                if (parts.length >= 2) {
	                    String key = parts[0].trim();
	                    String value = parts[1].trim();
	                    riesgos.put(key, value);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return riesgos;
	    }
	 
	 public Map<String, String> generarRiesgos(){
		 //Map<String, String> riesgos = new LinkedHashMap<>();
		 // Iterar sobre los nombres de las propiedades
		 String filePath = "src/main/resources/riesgos.properties";
	     riesgos = readRiesgos(filePath);
	     return riesgos;
	 }
	 
	public Map<String, Integer> getEscenarios() {
		return escenarios;
	}

	public void setEscenarios(Map<String, Integer> escenarios) {
		this.escenarios = escenarios;
	}
	 
	public void setRespuestasEscenarios(String riesgo, Integer calificacion) {
		this.escenarios.put(riesgo, calificacion);
	}

	public String getRiesgo(String numriesgo) {
		return riesgos.get(numriesgo);
	}
	
	public Map<String, String> getRiesgos() {
		return riesgos;
	}

	public void setRiesgos(Map<String, String> riesgos) {
		this.riesgos = riesgos;
	}

	public Integer getCalifRiesgo(String numRiesgo) {
		return escenarios.get(numRiesgo);
	}
	
}
