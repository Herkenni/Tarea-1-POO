package Etapa1;
import java.util.Scanner;
import java.swing.Timer;

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
        mascota.getEstado();

        //inicializado todos los aspectos/atributos y mostrados, se procede a que comience a pasar el tiempo
        Timer timer= new Timer(1000, mascota);//interrupcion cada 1 segundo que activara el actionperformed
        timer.start();//iniciamos el timer

        
    }  
}
