package Etapa2;
/*
Es el hijo de Item
*/
public class Medicina extends Item{


    public Medicina(String nombre, int id, int energia, int salud, int felicidad, int cantidad){
        super(nombre,id,energia,salud,felicidad,cantidad);
    }

    
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
