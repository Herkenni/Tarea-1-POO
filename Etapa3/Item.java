package Etapa3;
/*
Es la clase padre de Medicina, Juguete y Comida
*/
public abstract class Item {
    /*
    String nombre: Nombre del Item
    Int id: La id del Item que se asigna al leer el documento
    Int energia: La energia que da el Item al usarse en la mascota
    Int salud: La salud que da el Item al usarse en la mascota
    Int felicidad: La felicidad que da el Item al usarse en la mascota
    Int cantidad: La cantidad que queda del Item especifico en el inventario
    */
    protected String nombre;
    protected int id, energia, salud, felicidad,cantidad;
    
    //Funciones set
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setenergia(int energia){
        this.energia = energia;
    }
    public void setsalud(int salud){
        this.salud=salud;
    }
    public void setfelicidad(int felicidad){
        this.felicidad=felicidad;
    }
    public void setcantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    //Funciones get
    public String getnombre(){
        return this.nombre;
    }
    public int getid(){
        return this.id;
    }
    public int getenergia(){
        return this.energia;
    }
    public int getsalud(){
        return this.salud;
    }
    public int getfelicidad(){
        return this.felicidad;
    }
    public int getcantidad(){
        return this.cantidad;
    }
    
    //Disminuye la cantidad del Item en 1 al usarse
    public void disminuir(){
        this.cantidad= this.cantidad-1;
    }
    //Clase abstracta
    public abstract void inicio();
    public abstract void usando();
    
}
