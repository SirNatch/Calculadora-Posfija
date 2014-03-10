package Cola;

import Nodo.Nodo;

public class Cola<T> {
    Nodo raiz;
    Nodo fondo;

    public boolean vacia(){
        if(raiz == null)
            return true;
        else
            return false;
    }
    
    public void push(T dato){
        Nodo nuevo = new Nodo(dato);
        if(vacia()){
            raiz = nuevo;                       
            fondo = nuevo;
        }else{
            fondo.setLiga(nuevo);
            fondo = nuevo;
        }
    }
    
    public Nodo pop(){ 
         Nodo dato = new Nodo(raiz.getDato());
            if(raiz == fondo){
                raiz = null;
                fondo = null;
            }else{
                raiz = raiz.getLiga();
            }
         return dato;

    }
    
    public Nodo peek(){ 
           return raiz; 
    }
    
    public String imprimir(){
        String aux = "";
        while(!vacia()){
            aux = aux + pop();
        }
        return aux;
    }
}
