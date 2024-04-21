package Etapa3;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Mascota mascota: Una clase Mascota llamada mascota que se usara durante el juego
        Scanner leer: Una variable de lectura para los comandos que hace el usuario
        Item Objeto: Es una variable default que simplemente guardara temporalmente un valor de la lista de objetos para poder usarlo y modificarlo
        */
        Item objeto;
        Inventario inventario= new Inventario();
        String[] datos; //se crea un arreglo tipo string para agrupar los datos del csv y luego desglosarlo
        Mascota mascota = new Mascota();

      //se crea un try catch para verificar si se entrego correctamente el archivo csv, por medio de una variable tipo scanner 
      //variable scanner recibe el archivo csv
        try(Scanner scanfile = new Scanner(new File(args[0]))) { 

          //bucle que recorre todo el archivo csv hasta observar que no existe otra linea de lectura
            while (scanfile.hasNextLine()) {
              //a traves de la variable scanner se agrega al arreglo "datos" cada elemento que se encuentra de la fila
                datos=scanfile.nextLine().split(";"); //se genera el arreglo cortando los ";" 

              //se hace un if para saber si estamos en presencia de la primera fila que solo contiene el nombre de la mascota
              if (datos.length==1) {
                    mascota.setNombre(datos[0]);
                }

              //se hace un switch sabiendo que datos[1] contiene el tipo de item
              //segun el item se incializa por separado y se agrega al inventario
              //para llevar esto acabo se agrega un constructor no vacio para cada item (etapas anteriores no poseen este constructor)
                switch (datos[1]) {

                    case "Juguete":
                             
                          Juguete juguete=new Juguete(datos[2],Integer.parseInt(datos[0]),Integer.parseInt(datos[3]));//metodo constructor
                          juguete.inicio();
                          inventario.AgregarItem(juguete);
                           break;

                    case "Medicina":

                    Medicina medicamento=new Medicina(datos[2],Integer.parseInt(datos[0]),Integer.parseInt(datos[3]));//metodo cosntructor
                    medicamento.inicio();
                    inventario.AgregarItem(medicamento);

                    case "Comida":

                    Comida alimento=new Comida(datos[2],Integer.parseInt(datos[0]),Integer.parseInt(datos[3])); //metodo constructor
                    alimento.inicio();
                    inventario.AgregarItem(alimento);

                    default:
                        System.exit(0);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("error de entrega");
        }

        for(int j = 0; j<inventario.TamañoLista();j++){
            objeto=inventario.ObtenerItem(j);
            System.out.println(objeto.getid()+": "+objeto.getnombre()+", cantidad "+objeto.getcantidad());
        }
    }
}
        /* 

        String nombre;
        Mascota mascota = new Mascota();
        Scanner leer = new Scanner(System.in);
        Item objeto;
        int desicion=0;
        
        //Se inician los parametros de mascota
        mascota.Inicio();
        
        //Una clase Inventario llamado inventario que almacena los Items que se van creando en una lista arraylist de Items
        Inventario inventario = new Inventario();
        //Se establecen las variables Item que nos dijieron y se agregan a la la clase inventario (Agregando el nombre), la id, cantidad y la inicialización de las estadisticas
        Item Pelota = new Juguete();
        Pelota.setnombre("Pelota");
        Pelota.setid(1);
        Pelota.setcantidad(10);
        Pelota.inicio();
        
        Item Queso = new Comida();
        Queso.setnombre("Queso");
        Queso.setid(2);
        Queso.setcantidad(10);
        Queso.inicio();
        
        Item Pan = new Comida();
        Pan.setnombre("Pan");
        Pan.setid(3);
        Pan.setcantidad(10);
        Pan.inicio();
        
        Item Jarabe = new Medicina();
        Jarabe.setnombre("Jarabe");
        Jarabe.setid(4);
        Jarabe.setcantidad(10);
        Jarabe.inicio();
        
        //Se agregan a la clase inventario los objetos que seran despues agregados a la ArrayList que tiene la clase
        inventario.AgregarItem(Pelota);
        inventario.AgregarItem(Queso);
        inventario.AgregarItem(Pan);
        inventario.AgregarItem(Jarabe);
        System.out.println("Mascota Virtual");
        
        //Mientras desicion no tenga un valor igual a 9 no se detendra el while
        while(desicion!=9){

            //Se disminuyen las estadisticas de la mascota y aumenta su edad, para despues ver el Estado de la mascota con las estadisticas que quedo
            mascota.Estado();
            /Lo siguiente se muestran todas las caracteristicas de la mascota
            System.out.println("Tiempo simulado "+mascota.getTiempo());
            System.out.println("Atributos");
            System.out.println("------------");
            System.out.println("Nombre: "+mascota.getNombre());
            System.out.println("Edad: "+mascota.getEdad());
            System.out.println("Salud: "+mascota.getSalud());
            System.out.println("Energia: "+mascota.getEnergia());
            System.out.println("Felicidad: "+mascota.getFelicidad());
            System.out.print("Estado: ");
            mascota.Humor();
            mascota.getEstado();
            
            
            //Las acciones que puede realizar el usuario
            System.out.println("Acciones");
            System.out.println("------------");
            System.out.println("0: Dormir");
            
            //Se hace un recorrido de la lista de inventario lista_items, para mostrar su ID, Nombre y la cantidad del objeto
            for(int j = 0; j<inventario.TamañoLista();j++){
                objeto=inventario.ObtenerItem(j);
                System.out.println(objeto.getid()+": "+objeto.getnombre()+", cantidad "+objeto.getcantidad());
            }
            
            //Se espera la respuesta del usuario para ser almacenado en la variable desicion
            System.out.print("Seleccione un elemento del inventario: ");
            desicion=leer.nextInt();
            
            //Se busca denuevo en la lista de inventario algun item ID que coincida con la variable desicion para usarlo y aumentar las estadisticas de la mascota para despues disminuir la cantidad
            for(int j = 0; j<inventario.TamañoLista();j++){
                objeto=inventario.ObtenerItem(j);
                if(objeto.getid()==desicion){
                    mascota.Vejez(); 
                    objeto.usando();
                    mascota.Aumentar(objeto);
                    mascota.aumentarTiempo();
                    System.out.println("pasa el tiempo...");
                    

                    //Si la cantidad es igual a 0, se elimina el objeto del inventario
                    if(objeto.getcantidad()== 0){
                        inventario.EliminarItem(j);
                        break;
                    }else{
                        inventario.ModificarItem(j, objeto);
                        break;
                    }
                    //Si la primera consulta no es igual, se consultara por si acaso que si la desicion es dormir
                }else if(desicion==0){
                    mascota.Vejez();
                    mascota.Dormir();
                    mascota.aumentarTiempo();
                    System.out.println("pasa el tiempo...");
                    break;
                }
            }
            
            
        }
    }  
}

*/
