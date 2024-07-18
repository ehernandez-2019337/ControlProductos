/**
*esto representa los empaquetados y las extensiones de tras clases
*
*/
package org.emersonhernandez.sistemas;
import org.emersonhernandez.vista.VistaDelProducto;
import java.util.Scanner;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class Sistemas{
	public static void main(String[] args) {
		VistaDelProducto vista = new VistaDelProducto(); 
		Scanner entrada = new Scanner(System.in); 
		int opcionMenu = 0;
		/**
		*OPciones del menu
		*/
		String [] listaMenu = {"\nRegistro de producto eliga una opcion: ",
		"1. Crear producto: ",
		"2. Leer productos: ",
		"3. Buscar producto: ",
		"4. Actualizar producto: ",
		"5. Borrar productos: ",
		"6. Salir. \n"};
		do{
				for(int i=0; i<7;i++)
					System.out.println(listaMenu[i]);
				opcionMenu = entrada.nextInt();
			switch(opcionMenu){
				case 1:
					vista.nuevoProducto(); 
				break;
				case 2: 
					vista.mostrarProducto();
				break;
				case 3: 
					vista.mostrarProductosId();
				break;
				case 4: 
					vista.actualizarProducto();
				break;
				case 5: 
					vista.borrarProducto();
				break;
				case 6: 
					System.exit(0);
				default:
					System.out.println("Por favor siga instrucciones");
			}
		}while(opcionMenu!=6);
	}
}