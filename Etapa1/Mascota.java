package Etapa1;

/*
  Mascota
 */
public class Mascota {

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

    public void Estado(){ //pasamos como parametro un objeto de tipo Mascota
        if (this.salud<=10) {
            /*disminucion generica, ya que en realidad 
            disminuye por cada incremento de tiempo de ejecucion*/
            this.felicidad=this.felicidad-20;
        }

        else if (this.salud<=50 && this.edad>5 && this.edad<=10) {
            
            //misma analogia, los decrementos se tienen
            // que hacer por tiempo de simulacion, esto es solo generico
            this.energia=this.energia-20;
            this.felicidad=this.felicidad-20;

        }

        else if (this.salud<=50 && this.edad>10) {
            //decremento igual que los anteriore(por tiempo de simulacion)
            //estos numeros que se restan son solo para mostrar una representacion
            this.energia=this.energia-20;
            this.felicidad=this.felicidad-30;          
        }



        //hacer condicionales tenidos los valores finales
        //de la energia, felicidad, salud, donde 
        //cada if tendra su propio retorno que son los siguientes:
        
        /*return "(-_-) Meh.... ";

        return "/(^_^)/ Weeeeeh!";

        return "(._.) snif.... ";

        return "(0o0) hambre hambre!";

        return "(ôwô) grrrr....";

        return "(=_=) zzzz.... ";

        return "(x_x) fin del juego";

        return "(-.-)";*/
    }

}
