/**
 * 
 */
package riesgos;

//import java.io.Console;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import controller.EscenariosDeRiesgos;
//import modelo.Escenario;
import modelo.JEnv;
import picocli.CommandLine;
import picocli.CommandLine.Command;


/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenidos y bienvenidas a su programa de Gestión de riesgos");
			
		System.out.println("Por favor responda únicamente con SI o NO el siguiente cuestionario");
		
		Properties properties = new Properties();
		
		EscenariosDeRiesgos escenarioDeRiesgos = new EscenariosDeRiesgos();
		
		properties = escenarioDeRiesgos.cargarArchivoRiesgos();
		escenarioDeRiesgos.generarEscenariosDeRiesgo(properties);
	
		for(int i = 0; i <= escenarioDeRiesgos.getRiesgos().size(); i = i + 1)
		{
			System.out.println(escenarioDeRiesgos.getRiesgos().get(i).getPregunta());
			System.out.println("R/");
			String respuesta = scanner.nextLine();
			if(respuesta.isEmpty() || (!respuesta.equals("Si") && (!respuesta.equals("No")))) {
				System.out.println("Por vavor responda a la pregunta con Si o No");
				i= i-1;
			}else {
				escenarioDeRiesgos.setRiesgo(escenarioDeRiesgos.getRiesgos().get(i), respuesta, i);
			}
		}    */
		
		 int exitCode = new CommandLine(new JEnv()).execute(args); 
	        System.exit(exitCode); 
	}	
	
}
