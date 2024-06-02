/**
 * 
 */
package javatests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import controller.Amenazas;

/**
 * 
 */
public class EscenariosDeRiesgosTest {
	private Amenazas amenazas = new Amenazas("Trabaja menos de 9 horas diarias?");

	@Test
	void result_map_full_whit_risk() {
				
		//1. Preparación
			
		var pregunta = amenazas.getPreguntaAmenazas("PREGUNTA" + 1);
		
		assertNotNull(pregunta);
		assertEquals("Trabaja menos de 9 horas diarias?", amenazas);
		
		
	}

}
