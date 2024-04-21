package Etapa4;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.file;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        /*
        String nombre: Nombre de la mascota, todavia por arreglar
        Mascota mascota: Una clase Mascota llamada mascota que se usara durante el juego
        Scanner leer: Una variable de lectura para los comandos que hace el usuario
        Double tiempo: Es el tiempo que transcurre con cada acción que pasa
        Item Objeto: Es una variable default que simplemente guardara temporalmente un valor de la lista de objetos para poder usarlo y modificarlo
        Int desicion: Es la desicion que toma el usuario sobre que objeto utilizar entre la lista que se le muestra
        */

        // Verificar que se proporcionó el nombre del archivo CSV como argumento
        if (args.length == 0) {
            System.out.println("Debe proporcionar el nombre del archivo CSV como argumento.");
            return;
        }
        
        // Obtener el nombre del archivo CSV del primer argumento
        String archivoCSV = args[0];

        // Leer el archivo CSV y procesar cada línea
        try {
            File file = new File(archivoCSV);
            Scanner scanner = new Scanner(file);

            // Procesar cada línea del archivo
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                // Procesar la línea como desees, por ejemplo:
                System.out.println(linea);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró: " + archivoCSV);
            e.printStackTrace();
            return;
        }

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
            /*Lo siguiente se muestran todas las caracteristicas de la mascota*/
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
            
            // Mostrar acciones adicionales
            System.out.println("Acciones adicionales:");
            System.out.println("10: Dormir por un cierto tiempo");
            System.out.println("11: Continuar la simulación sin realizar ninguna acción");
            System.out.println("12: Terminar la simulación");
            System.out.print("Seleccione una acción adicional: ");
            int accionAdicional = leer.nextInt();

            // Procesar la acción adicional seleccionada por el usuario
            switch (accionAdicional) {
                case 10:
                    // Dormir por un cierto tiempo
                    System.out.print("Ingrese la cantidad de horas que desea dormir: ");
                    double horasDormir = leer.nextDouble();
                    mascota.Dormir(horasDormir);
                    mascota.aumentarTiempo();
                    System.out.println("La mascota ha dormido por " + horasDormir + " horas.");
                    break;
                case 11:
                    // Continuar la simulación sin realizar ninguna acción adicional
                    System.out.println("Continuando la simulación sin realizar ninguna acción adicional.");
                    break;
                case 12:
                    // Terminar la simulación
                    System.out.println("Terminando la simulación...");
                    desicion = 9; // Esto hará que el bucle while termine en la siguiente iteración
                    break;
                default:
                    System.out.println("Opción no válida.");
            }


            
        }
    }  
}

