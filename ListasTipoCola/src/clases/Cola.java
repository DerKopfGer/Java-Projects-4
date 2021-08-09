package clases;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Metodo para saber si la cola esta vacia
    public boolean ColaVacia(){
        if(inicioCola == null){
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para insertar la cola
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if(ColaVacia()){
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
            
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    //Metodo para extraer de la cola
    public int Extraer(){
        if(!ColaVacia()){
            int informacion = inicioCola.informacion;
            
            if(inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
                
            } else {
                inicioCola = inicioCola.siguiente;
                
            }
              return informacion;      
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String colaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        for(int i = cadena.length -1; i >= 0; i--){
            colaInvertida += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola = "";
    }
}
