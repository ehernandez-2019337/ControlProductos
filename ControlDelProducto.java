package org.emersonhernandez.controlador;
import java.util.ArrayList; 
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
public class ControlDelProducto{

	//declaración de variables
	private ArrayList<Producto> listaDeProductos;
	private static ControlDelProducto instancia; 
	
	//fase de declaracion y definicion de metodos 
	public ControlDelProducto(){
		listaDeProductos = new ArrayList<Producto>();
	}
	public int cantidadDeElementos(){
		return listaDeProductos.size();
	}
	public static ControlDelProducto getInstancia(){
		if(instancia == null){
			instancia = new ControlDelProducto();
		}return instancia; 
	}
	public void crearProducto(Producto producto){
		listaDeProductos.add(producto);
	}
	
	public ArrayList<Producto> getListaDeProductos(){
		return listaDeProductos;
	}
	
	public void eliminarProducto(Producto producto){
		listaDeProductos.remove(producto);
	}
	public void eliminarProducto(int id){
		Producto posicion = new Producto();
		for(Producto producto : listaDeProductos	){
			if(producto.getId()== id){
				posicion = producto;
				listaDeProductos.remove(posicion);
				break;
			}
		}
	}

	public Producto buscarProducto(int idProducto){
		Producto producto = null; 
		for (Producto elemento : listaDeProductos){
			if (elemento.getId()==idProducto){
				producto = elemento;
			break;
			}
		}return producto;
	}

	public void actualizarProducto(Producto productoAntiguo, Producto productoActualizado){
		int indice =  listaDeProductos.indexOf(productoAntiguo);
		listaDeProductos.set(indice, productoActualizado);

	}

}