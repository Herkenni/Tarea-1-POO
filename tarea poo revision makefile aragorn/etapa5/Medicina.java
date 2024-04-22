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
    
    //La acción usando se encargara de emitir un mensaje y a su vez disminuir la cantidad del Item en 1
    @Override
    public void usando(){
        System.out.println("Aplicando medicamento "+this.nombre+"...");
        this.cantidad=this.cantidad-1;
    }
    
}
