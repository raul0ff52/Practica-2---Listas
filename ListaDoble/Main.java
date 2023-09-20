/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoblementeenlazada;

/**
 *
 * @author raulf
 */
public class Main {
    
    public static void main(String[] args) {
    
        System.out.println("Lista doblemente Enlazada");
        ListaDoblementeEnlazada listaDoble = new ListaDoblementeEnlazada();
        
        listaDoble.insertar(5);
        listaDoble.insertar(59);
        listaDoble.insertar(91);
        listaDoble.insertar(-17);
        listaDoble.insertar(73);
        listaDoble.insertar(34);
        listaDoble.insertar(40);
        
        
        System.out.printf("Longitud: %d\n", listaDoble.getLongitud());
        
        listaDoble.eliminar(2);
        listaDoble.eliminar(3);
       
        System.out.printf("Longitud: %d\n", listaDoble.getLongitud());
         
        System.out.println("El valor del indice 3 es: "+listaDoble.obtener(3));
    } 
}
