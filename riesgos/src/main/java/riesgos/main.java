/**
 * 
 */
package riesgos;

import java.util.Properties;
import java.util.Scanner;

import controller.Amenazas;
import controller.EscenariosDeRiesgos;
import modelo.Escenario;
import modelo.JEnv;
import picocli.CommandLine;


public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenidos y bienvenidas a su programa de Gestion de riesgos");
		
		System.out.println("A continuacion le haremos una serie de preguntas para realizar un analisis de riesgos personal sobre usted");
		
		System.out.println("Se trata de un cuestionario de 12 preguntas a las cuales debe responder con si o no");
			
		System.out.println("Escriba cualquier tecla si quiere continuar de lo contrario escriba 1 para salir");
		
		String continuar = scanner.nextLine();
		
		if (continuar.equals("1")) {
			 System.exit(0);
		}
		
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
		
		System.out.println("A continuación le presentamos el resultado del análisis de riesgos personal");
		mostrarResultados(escenariosDeRiesgos);
		
		
		
		 int exitCode = new CommandLine(new JEnv()).execute(args); 
	        System.exit(exitCode); 
	}	
	
	
	static void mostrarResultados(EscenariosDeRiesgos escenarioDeRiesgos) {
		
		for (int i = 0; i < escenarioDeRiesgos.getRiesgos().size(); i++) {
			if (escenarioDeRiesgos.getCalifRiesgo("RIESGO" + (i+1)) >= 2) {
				System.out.println("Tienes un riesgo de moderado a alto de: " + escenarioDeRiesgos.getRiesgo("RIESGO" + (i+1)));
			}
			
		}
		
	}
	
}
