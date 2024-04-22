import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        String nombre: Nombre de la mascota, todavia por arreglar
        Mascota mascota: Una clase Mascota llamada mascota que se usara durante el juego
        Scanner leer: Una variable de lectura para los comandos que hace el usuario
        */
        String nombre;
        Mascota mascota = new Mascota();
        Scanner leer = new Scanner(System.in);
        //Se inician los parametros de mascota
        mascota.Inicio();
        //Una lista que almacena los Items que se van creando
        ArrayList<Item> lista_items = new ArrayList<>();
        //Se establecen las variables Item que nos dijieron y se agregan a la lista lista_items (Agregando el nombre), la id y la inicialización de las estadisticas
        Item Queso = new Comida();
        Queso.setnombre("Queso");
        Queso.setid(1);
        Queso.inicio();
        Item Jarabe = new Medicina();
        Jarabe.setnombre("Jarabe");
        Jarabe.setid(2);
        Jarabe.inicio();
        Item Pelota = new Juguete();
        Pelota.setnombre("Pelota");
        Pelota.setid(3);
        Pelota.inicio();
        //Se agregan a la lista los Items creados
        lista_items.add(Queso);
        lista_items.add(Jarabe);
        lista_items.add(Pelota);
        /*Lo siguiente se muestran todas las caracteristicas de la mascota*/
        System.out.println("Mascota Virtual");
        System.out.println("Atributos");
        System.out.println("------------");
        System.out.println("Nombre: "+mascota.getNombre());
        System.out.println("Edad: "+mascota.getEdad());
        System.out.println("Salud: "+mascota.getSalud());
        System.out.println("Energía: "+mascota.getEnergia());
        System.out.println("Felicidad: "+mascota.getFelicidad());
        System.out.print("Estado: ");
        mascota.Humor();
        mascota.getEstado();


        //Se recorre la lista de Items y se va interactuando con ellos
        for(Item aux: lista_items){
            mascota.Aumentar(aux);
            aux.usando();
            System.out.println("Atributos");
            System.out.println("------------");
            System.out.println("Nombre: "+mascota.getNombre());
            System.out.println("Edad: "+mascota.getEdad());
            System.out.println("Salud: "+mascota.getSalud());
            System.out.println("Energía: "+mascota.getEnergia());
            System.out.println("Felicidad: "+mascota.getFelicidad());
            System.out.print("Estado: ");
            mascota.Humor();
            mascota.getEstado();
        }
        //Se aplica la acción Dormir de la mascota por ultimo
        mascota.Dormir();
        System.out.println("Mascota Virtual");
        System.out.println("Atributos");
        System.out.println("------------");
        System.out.println("Nombre: "+mascota.getNombre());
        System.out.println("Edad: "+mascota.getEdad());
        System.out.println("Salud: "+mascota.getSalud());
        System.out.println("Energía: "+mascota.getEnergia());
        System.out.println("Felicidad: "+mascota.getFelicidad());
        System.out.print("Estado: ");
        mascota.Humor();
        mascota.getEstado();
        System.out.print("Estado: ");
    }  
}
