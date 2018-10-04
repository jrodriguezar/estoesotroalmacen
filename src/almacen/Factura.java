/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.util.ArrayList;

/**
 *
 * @author CARITO
 */
public class Factura {
    private ArrayList<Producto> productos;

    public Factura() {
        this.productos = new ArrayList<>();
    }
    
    
    public double valor(ArrayList<Producto> productos){
        int valor=0;
        for (int i = 0; i < productos.size(); i++) {
            valor+= productos.get(i).getValor();
            
        }
        return valor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void imprimirfact() {
        for (int i = 0; i < this.productos.size(); i++) {
            System.out.println("productos:                valor:  ");
            System.out.println(this.productos.get(i).getDescripcion() +"   "+ this.productos.get(i).getValor());
         }
        System.out.println("el total a pagar es: "+valor(this.productos));
    }



}
