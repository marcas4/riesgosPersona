/**
 * 
 */
package riesgos;

import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import controller.Amenazas;
import controller.EscenariosDeRiesgos;
import modelo.Escenario;
import modelo.JEnv;
import picocli.CommandLine;
import picocli.CommandLine.Command;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenidos y bienvenidas a su programa de Gestión de riesgos");
			
		System.out.println("Por favor responda únicamente con SI o NO el siguiente cuestionario");
		
		Properties properties = new Properties();
		
		Amenazas amenazas = new Amenazas();
		
		amenazas.generarAmenazas();
		Amenazas escenarios = new Amenazas();
		EscenariosDeRiesgos escenariosDeRiesgos = new EscenariosDeRiesgos();
		
		escenariosDeRiesgos.generarRiesgos();
		Integer aumentaRiesgo =0;
				
		for(int i = 0; i <= amenazas.getAmenazas().size() - 1; i = i + 1) {
			Integer numPregunta = i+1;
			String pregunta = amenazas.getPreguntaAmanazas("PREGUNTA"+numPregunta);
			System.out.println(pregunta);
			System.out.println("R/");
			Escenario escenario = new Escenario();
			escenario.setPregunta(pregunta);
			escenario.setRespuesta(scanner.nextLine());
			if(escenario.getRespuesta().isEmpty() || (!escenario.getRespuesta().equalsIgnoreCase("Si") && (!escenario.getRespuesta().equalsIgnoreCase("No")))) {
				System.out.println("Por vavor responda a la pregunta con Si o No");
				i= i-1;
			}else {
					if(escenario.getRespuesta().equalsIgnoreCase("no")) {
						aumentaRiesgo++;
					}
					if ((i+1) % 3 == 0) {
						for (int j = 0; j <= 3 - 1; j ++) {
							escenariosDeRiesgos.setRespuestasEscenarios("RIESGO"+(j+i-1), aumentaRiesgo);
						}
						aumentaRiesgo = 0;
					}
			}
			
			escenarios.setAmenazas(escenario);
		    
		}
		
		 int exitCode = new CommandLine(new JEnv()).execute(args); 
	        System.exit(exitCode); 
	}	
	
}
