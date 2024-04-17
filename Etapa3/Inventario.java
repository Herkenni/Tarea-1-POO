public class Inventario extends Item{

  private Item[] inventario;
  private int Largo;//tamaño del inventario

  //constructores
    public Inventario(int largo){
        inventario = new Item[largo];
    }

  //getters y setters
  public Item[] getInventario(){
    return inventario;
  }

  public int getLargo(){
    return largo;
  }

 public void setLargo(int Largo){
  this.Largo=Largo;
}


  //metodo para crear lista con todo el inventario
//agrega item al inventario public void
//se usa una vez definido el inventario
 AgregarItem(Item item){
 
 }

//metodo para obtener el largo que tendrá el inventario
  public void LargoInventario(Item item){

  }
  

  
}
