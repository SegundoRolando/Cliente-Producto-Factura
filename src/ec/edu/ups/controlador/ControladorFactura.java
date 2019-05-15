/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class ControladorFactura {
    
    private Set<Factura> lista;
    private int numero;

    public int getCodigo() {
        return numero;
    }
    
    public ControladorFactura() {
        lista = new HashSet<>();
        numero = 1;
    }
    
    public void crear(Factura facturaCabecera){
        facturaCabecera.setNumeroFactura(numero);
        numero++;
        lista.add(facturaCabecera);
    }
    
    public Factura leer(int numero){
        for (Factura facturaCabecera : lista) {
            if(facturaCabecera.getNumeroFactura()== numero){
                return facturaCabecera;
            }
        }
        return null;
    }
    
    public void actualizar(Factura facturaCabecera){
        if(lista.contains(facturaCabecera)){
            lista.remove(facturaCabecera);
            lista.add(facturaCabecera);
        }
    }
    
    public void eliminar(int numero){
        for (Factura facturaCabecera : lista) {
            if(facturaCabecera.getNumeroFactura()== numero){
                lista.remove(facturaCabecera);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Factura facturaCabecera : lista) {
            System.out.println(facturaCabecera.getNumeroFactura());
        }
    }
    
}
