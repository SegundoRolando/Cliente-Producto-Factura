/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class ControladorProducto {
    private Set<Producto> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    public ControladorProducto(){
    lista=new HashSet<>();
    int codigo=1;
    }    
    
     public void create(ec.edu.ups.modelo.Producto producto){
        producto.setNumeroProducto(codigo);
        codigo++;
        lista.add(producto);
    }
    
    public ec.edu.ups.modelo.Producto read(int codigo){
        for (ec.edu.ups.modelo.Producto producto : lista) {
            if(producto.getNumeroProducto()== codigo){
                return producto;
            }
        }
        return null;
    }
    
    public void update(ec.edu.ups.modelo.Producto producto){
        if(lista.contains(producto)){
            lista.remove(producto);
            lista.add(producto);
        }
    }
    
    public void delete(int codigo){
        for (ec.edu.ups.modelo.Producto producto : lista) {
            if(producto.getNumeroProducto()== codigo){
                lista.remove(producto);
                break;
            }
        }
    }
    public void imprimir(){
        for (Producto producto : lista) {
            System.out.println(producto.getNombre());
        }
    }
}
