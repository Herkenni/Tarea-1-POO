package Etapa3;

//Clase inventario

import java.util.ArrayList;

public class Inventario {
    //Arraylist<Item> lista_items: Consiste en una lista Arraylist que almacena todos los Items que se van registrando
    ArrayList<Item> lista_items = new ArrayList<>();
    
    //Funcion que recibe un Item y lo almacena en la lista lista_items
    public void AgregarItem(Item item){
        this.lista_items.add(item);
    }
    
    /*Funcion que recibe un int y un Item, busca en la lista el puesto i, para modificarlo con Item
    más que nada para actualizar valores*/
    public void ModificarItem(int i, Item c){
        lista_items.set(i, c);
    }
    
    //Función que entrega el tamaño de la lista lista_items
    public int TamañoLista(){
        return this.lista_items.size();
    }
    
    //Función que entrega un Item que esta ubicado en el valor de int dato
    public Item ObtenerItem(int dato){
        return this.lista_items.get(dato);
    }
    
    //Función que se encarga de eliminar un dato que esta ubicado en el valor int dato
    public void EliminarItem(int dato){
        this.lista_items.remove(dato);
    }
}
