/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimple;

/**
 *
 * @author raulf
 */
public class ListaSimplementeEnlazada {

    
    
     private Nodo primerNodo;
     private int longitud;

    public ListaSimplementeEnlazada() {
         primerNodo = null;
        longitud = 0;
     
    }

    public void insertar(int dato) {
        
    Nodo nuevoNodo = new Nodo(dato);
       if (primerNodo == null) {
           primerNodo = nuevoNodo;
       } else {
           Nodo nodoActual = primerNodo;
           while (nodoActual.getSiguiente() != null) {
           nodoActual = nodoActual.getSiguiente();
       }
       nodoActual.setSiguiente(nuevoNodo);
   }
longitud++;
    }
    
    public int obtener (int indice){
        if (indice <0 || indice >= longitud){
            System.err.println("Indice fuera de rango");
            return -1;
        }
         
        
        Nodo actuaNodo = primerNodo;
        
        for (int i = 0; i < indice; i++) {
            actuaNodo = actuaNodo.getSiguiente();
        }
        return actuaNodo.getDato();
    }
    
    public void eliminar(int indice) {
        
        if (indice < 0 || indice >= longitud) {
        System.err.println("Indice fuera de rango");
        return;
    }
        
        if (indice == 0) {
        // Si el índice es 0, el nodo a eliminar es el primer nodo.
            primerNodo = primerNodo.getSiguiente();
        } else {
        // Si el índice no es 0, encontramos el nodo anterior al nodo a
       //eliminar.
        Nodo nodoAnterior = primerNodo;
        for (int i = 0; i < indice - 1; i++) {
         nodoAnterior = nodoAnterior.getSiguiente();
        }
        // Ahora, el nodo anterior apuntará al siguiente nodo del nodo a
        //eliminar.
        Nodo nodoEliminar = nodoAnterior.getSiguiente();
        nodoAnterior.setSiguiente(nodoEliminar.getSiguiente());
        }
        longitud--;
    }
    

   public boolean estaVacia() {
        return primerNodo == null;
    }

   public Nodo getFrente() {
        return primerNodo;
    }

    public int getLongitud() {
        return longitud;
    }
    
    
  /*  public static void main(String[] args) {
        // TODO code application logic here
    }*/

    
}
