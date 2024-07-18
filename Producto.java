package org.emersonhernandez.modelo;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class Producto{

	//declarando variables 
	private String marcaProducto;
	private String nombreProducto;
	private int idProducto;
	
	//metodos para los datos
	public Producto(){}
	public Producto(int id, String nombre, String marca){
		this.idProducto = id;
		this. nombreProducto = nombre;
		this.marcaProducto = marca;
	}
	public void setId(int id){
		this.idProducto = id;
	}
	public int getId(){
		return idProducto;
	}
	public void setNombre(String nombre){
		this.nombreProducto = nombre;
	}
	public String getNombre(){
		return nombreProducto;
	}
	public void setTelefono(String marca){
		this.marcaProducto = marca;
	}
	public String getTelefono(){
		return marcaProducto;
	}
}