package Etapa2;
/*
Es el hijo de Item
*/
public class Medicina extends Item{
    
    //Las estadisticas que entrega la Medicina
    @Override
    public void inicio(){
        this.energia=0;
        this.salud=40;
        this.felicidad=0;
    }
    @Override
    public void usando(){
        System.out.println("Aplicando medicamento "+this.nombre+"...");
    }
    
}
