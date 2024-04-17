package Etapa2;
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
    @Override
    public void usando(){
        System.out.println("Usando Juguete "+this.nombre+"...");
    }
    
}
