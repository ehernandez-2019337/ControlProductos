package org.emersonhernandez.vista;
import java.util.Scanner; 
import org.emersonhernandez.controlador.ControlDelProducto;
import org.emersonhernandez.modelo.Producto;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class VistaDelProducto{
private ControlDelProducto controlador = ControlDelProducto.getInstancia();
	private Scanner entrada = new Scanner(System.in);

	//producto producto = new producto();
	public VistaDelProducto(){}

	public void nuevoProducto(){
		Producto producto = new Producto();
		entrada.nextLine();
		System.out.println("Ingrese el nombre del producto: ");
		producto.setNombre(entrada.nextLine());
		System.out.println("Ingrese la marca del producto: ");
		producto.setTelefono(entrada.nextLine());
		producto.setId(controlador.cantidadDeElementos()+1);
		controlador.crearProducto(producto);
	}
	public void mostrarProducto(){
		for (Producto producto : controlador.getListaDeProductos()){
			System.out.println("Id: "+producto.getId());
			System.out.println("Nombre: "+producto.getNombre());
			System.out.println("Marca: "+producto.getTelefono());
		}
	}
	public void mostrarProductosId(){
		Producto producto = new Producto();
		System.out.println("Ingrese el id del producto a mostrar: ");
		producto = controlador.buscarProducto(entrada.nextInt());
		System.out.println("Id: "+producto.getId());
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Marca: "+producto.getTelefono());
	}
	public void borrarProducto(){
		System.out.println("Ingrese el id para eliminar el producto: ");
		controlador.eliminarProducto(entrada.nextInt());
	}
	public void actualizarProducto(){
		Producto productoAModificar = new Producto(); 
		System.out.println("Ingrese el id del producto que esta por actualizar"); 
		int id = entrada.nextInt();
		for(Producto productoAntiguo: controlador.getListaDeProductos()){
			if(productoAntiguo.getId()== id){
				System.out.println("Ingrese el nuevo ID: ");
				productoAModificar.setId(entrada.nextInt());
				System.out.println("Ingrese el nombre del producto: ");
				entrada.nextLine();
				productoAModificar.setNombre(entrada.nextLine()); 
				System.out.println("Ingrese el telefono del producto: "); 
				productoAModificar.setTelefono(entrada.nextLine());  
				controlador.actualizarProducto(productoAntiguo,productoAModificar);
				break;
			}
		}
	}
}