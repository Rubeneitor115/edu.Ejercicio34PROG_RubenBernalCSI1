/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase controladorad de la aplicacion
 * @author rbr - 151224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 151224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Obtengo la fecha actual
		LocalDate fecha = LocalDate.now();
		
		//Convierto la fecha al formato especificado
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaFormateada = fecha.format(formato);
		
		//Imprimo la fecha con el formato especifico
		System.out.println(fechaFormateada);

	}

}
