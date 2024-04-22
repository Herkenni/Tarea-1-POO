/*
Es el hijo de Item
*/
public class Comida extends Item{
    
    //se agrega un segundo contructor para cuando sus estadisticas no estan preestablecidas
    public Comida(){
        super();
    }
        //constructor cuando se sabe las estadisticas del item

       public Comida(String nombre, int id, int energia, int salud, int felicidad, int cantidad){
        //super(nombre,id,energia,salud,felicidad,cantidad);
    }


    
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
