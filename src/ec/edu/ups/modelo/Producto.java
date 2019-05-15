/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;


import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Producto {
    
    private String nombre;
    private int NumeroProducto;
    private double  precio;
    private  String detalle;
    
    public Producto(){
    
    }

    public Producto(String nombre, int NumeroProducto, double precio, String detalle) {
        this.nombre = nombre;
        this.NumeroProducto = NumeroProducto;
        this.precio = precio;
        this.detalle = detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroProducto() {
        return NumeroProducto;
    }

    public void setNumeroProducto(int NumeroProducto) {
        this.NumeroProducto = NumeroProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.NumeroProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.NumeroProducto != other.NumeroProducto) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.detalle, other.detalle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", NumeroProducto=" + NumeroProducto + ", precio=" + precio + ", detalle=" + detalle + '}';
    }
    
  
}
