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

  //metodo para crear lista con todo el inventario
  public void AgregarItem(Item item){//agrega item al inventario
  }

//metodo para obtener el largo que tendrá el inventario
  public void LargoInventario(Item item){
  }
  

  
}
