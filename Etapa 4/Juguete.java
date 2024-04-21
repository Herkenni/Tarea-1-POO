package Etapa4;
/*
Es el hijo de Item
*/
public class Juguete extends Item{
    
    //Las estadisticas que entrega el Juguete
    @Override
    public void inicio(){
        this.energia=0;
        this.salud=0;
        this.felicidad=30;
    }
    //La acción usando se encargara de emitir un mensaje y a su vez disminuir la cantidad del Item en 1
    @Override
    public void usando(){
        System.out.println("Usando Juguete "+this.nombre+"...");
        this.cantidad=this.cantidad-1;
    }
    
}
