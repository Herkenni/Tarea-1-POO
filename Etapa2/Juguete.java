package Etapa2;
/*
Es el hijo de Item
*/
public class Juguete extends Item{



       public Juguete(String nombre, int id, int energia, int salud, int felicidad, int cantidad){
        super(nombre,id,energia,salud,felicidad,cantidad);
    }

    
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
