package Etapa3;
/*
Es el hijo de Item
*/
public class Comida extends Item{
    
    //Las estadisticas que entrega la Comida
    @Override
    public void inicio(){
        this.energia=20;
        this.salud=20;
        this.felicidad=0;
    }
    @Override
    public void usando(){
        System.out.println("Dando de comer "+this.nombre+"...");
    }
}
