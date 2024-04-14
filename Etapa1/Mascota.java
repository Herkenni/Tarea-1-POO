package Etapa1;
import java.awt.event.*; ///libreria que contiene interfaz actionListener
/*
  Mascota
 */
public class Mascota implements ActionListener {

    /*
    String nombre: Nombre de la mascota
    Int Edad: Edad de la mascota
    Int Salud: Salud de la mascota
    Int Energia: Energia de la mascota
    Int Felicidad: Felicidad de la mascota
    EnumEstado Estado: Es una enumeración con todos los estados de la Mascota
    */
    protected String nombre;
    protected int edad, salud, energia, felicidad;
    protected EnumEstado Estado;

    //metodos constructores

    public Mascota(){ ///constructor para "setear" una mascota
    }
    //Iniciar una mascota con las estadisticas principales que nos declaran
    public void Inicio(){ //constructor para crear una mascota parametrizada
        this.nombre="Garfield";
        this.edad=0;
        this.salud=100;
        this.energia=100;
        this.felicidad=50;
        this.Estado=EnumEstado.NEUTRO;
    }

    ///metodos setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    //metodos getters

    public int getEdad() {
        return this.edad;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getFelicidad() {
        return this.felicidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getSalud() {
        return this.salud;
    }
    //Dependiento del valor de Estado, se obtiene un valor
    public void getEstado(){
        switch(this.Estado){
            case NEUTRO:
                System.out.println("(-_-) Meh.... ");
                break;
            case FELIZ:
                System.out.println("/(^_^)/ Weeeeeh!");
                break;
            case TRISTE:
                System.out.println("(._.) snif.... ");
                break;
            case HAMBRIENTO:
                System.out.println("(0o0) hambre hambre!");
                break;
            case ENOJADO:
                System.out.println("(ôwô) grrrr....");
                break;
            case CANSADO:
                System.out.println("(=_=) zzzz.... ");
                break;
            case MUERTO:
                System.out.println("(x_x) fin del juego");
                break;      
        }
    }

    ///metodos

    public void Estado(){
        if(felicidad>=60){
            Estado=EnumEstado.FELIZ;
        }

        else if(felicidad<=20){
            Estado=EnumEstado.TRISTE;
        }

        else if((salud<=20 && edad<=5) || (salud<=50 && edad>=5 && edad<=10)){
            Estado=EnumEstado.HAMBRIENTO;
        }

        else if(edad>5 && salud<=30 && energia<=30){
            Estado=EnumEstado.CANSADO;
        }

        else if((salud==0 || energia==0) || edad>=15){
            Estado=EnumEstado.MUERTO;
        }
    }



  //debemos implementar actionperformed en nuestra clase y tambien en el main. 
  // Cada vez que ocurre la interrupcion/evento se ejecuta el metodo actionPerformed que está
  //Timer creado en main se le asocia el objeto que contiene el metodo actionperformed
  
    @Override
    public void actionPerformed(ActionEvent e) {
        //condiciones si los atributos estan en cierto nivel y sus consecuencias 
        if (salud<=10) {
            felicidad=felicidad-20;
            
        }
          
        else if (salud<=50 && edad>5 && edad<=10) {
            energia=energia-20;
            felicidad=felicidad-20;
        }

        else if (salud<=50 && edad>10) {
            energia=energia-20;
            felicidad=felicidad-30;  
        }

      //condicional simple para pooner como limite que la energia y felicidad minimo pueden ser 0.
        energia=(energia<0)?0:energia; 
        felicidad=(felicidad<0)?0:felicidad;
        edad++;//va pasando la edad de la mascota de acuerdo al tiempo de simulacion
        
   }


  

}
