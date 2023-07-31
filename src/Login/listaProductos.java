/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author jairo
 */

//Diccionario donde se almacenaran los valores.
public class listaProductos {
    
    private String jnombre;
    private String jmarca;
    private String jprecio;
    private String jcantidad;
    private String jsubtotal;
    private String jtotal;
   
    // Getters y Setters para los parametros.
    public String getJnombre() {
        return jnombre;
    }

    public void setJnombre(String jnombre) {
        this.jnombre = jnombre;
    }

    public String getJmarca() {
        return jmarca;
    }

    public void setJmarca(String jmarca) {
        this.jmarca = jmarca;
    }

    public String getJprecio() {
        return jprecio;
    }

    public void setJprecio(String jprecio) {
        this.jprecio = jprecio;
    }

    public String getJcantidad() {
        return jcantidad;
    }

    public void setJcantidad(String jcantidad) {
        this.jcantidad = jcantidad;
    }

    public String getJsubtotal() {
        return jsubtotal;
    }

    public void setJsubtotal(String jsubtotal) {
        this.jsubtotal = jsubtotal;
    }

    public String getJtotal() {
        return jtotal;
    }

    // Variables que contienen los productos del JTable
    public void setJtotal(String jtotal) {
        this.jtotal = jtotal;
    }
    
    
    //Constructor que recibira los datos. , String marca, String precio, String cantidad, String subtotal, String total
    public listaProductos(String nombre, String marca, String precio, String cantidad, String subtotal, String total) {
        this.jnombre = nombre;
        this.jmarca = marca;
        this.jprecio = precio;
        this.jcantidad = cantidad;
        this.jsubtotal = subtotal;
        this.jtotal = total;
        
    }    
}
