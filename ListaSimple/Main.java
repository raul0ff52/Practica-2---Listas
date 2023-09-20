/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author raulf
 */
public class Main {
    
    public static void main(String[] args) {
    
        System.out.println("Lista Simplemente Enlazada");
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
        
        lista.insertar(5);
        lista.insertar(59);
        lista.insertar(91);
        lista.insertar(-17);
        lista.insertar(73);
        lista.insertar(34);
        lista.insertar(40);
        
        System.out.printf("Longitud: %d\n", lista.getLongitud());
        
        lista.eliminar(2);
        lista.eliminar(3);
       
        System.out.printf("Longitud: %d\n", lista.getLongitud());
         
        System.out.println("El valor del indice 3 es: "+lista.obtener(3));
             
    
    
    }
}
