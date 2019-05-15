/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class ControladorCliente {
    private Set<Cliente> lista;
    private  int codigo;
    
    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 1;
    }
    public int getCodigo(){
        return codigo;
    }
    
  
    public void crear(Cliente obj ){
        
        obj .setCodigo(this.codigo);
        lista.add(obj );
        codigo++;
    }
    
    
    public Cliente leer(int codigo){
        for(Cliente obj : lista){
            if(obj.getCodigo() == codigo){
                return obj;
            }
        }
        return null;
    }
  
   
    public void actualizar(Cliente obj ){
        if(lista.contains(obj )){
            lista.remove(obj );
            lista.add(obj);
        }
    }
    
   
    public void eliminar(int codigo){
        
        for(Cliente obj : lista){
            if(obj .getCodigo() == codigo){
                lista.remove(obj );
                break;
            }
        }
        
    }
    
    
    
    public void imprimir(){
        for (Cliente obj: lista) {
            System.out.println(obj.getNombre());
        }
    }

    public Set<Cliente> getLista() {
        return lista;
    }
   
        
    }

