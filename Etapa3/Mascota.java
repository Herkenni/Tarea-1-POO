package Etapa3;

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
    protected int salud, energia, felicidad;
    protected EnumEstado Estado;
    protected double tiempoSimulacion,edad; //se coloca en las mismas unidades que el tiempo ya que eso piden en el enunciado

    //metodos constructores

    public Mascota(){ ///constructor para "setear" una mascota
 
    }
    //Iniciar una mascota con las estadisticas principales que nos declaran
    public void Inicio(){ //constructor para crear una mascota parametrizada
        this.nombre="Garfield";
        this.edad=0;
        this.salud=50;
        this.energia=50;
        this.felicidad=50;
        this.Estado=EnumEstado.NEUTRO;
        this.tiempoSimulacion=0;
    }

    ///metodos setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
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

    public double getEdad() {
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

    public double getTiempo(){ //tiempo de simulacion 
        return this.tiempoSimulacion;
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
                System.exit(0); ///IMPORTANTE: se cierra el programa cuando la mascota muere
                break;      
        }
    }

    ///metodos
    //El metodo de dormir que tiene la mascota que aumenta la energia a 100
    public void Dormir(){
        this.energia=100;
        this.salud=this.salud+15;
        salud=(salud>100)?100:salud; //limite de valor de salud, ya que sin esto se iba al infinito
        System.out.println(this.nombre+" ha dormido como un tronco");
    }
    
    //Aumenta las estadisticas de la mascota segun el Item elegido, y si supera 100 lo deja en 100
    public void Aumentar(Item item){
        this.energia= this.energia + item.getenergia();
        if(this.energia>100){
            this.energia = 100;
        }
        this.felicidad= this.felicidad + item.getfelicidad();
        if(this.felicidad>100){
            this.felicidad = 100;
        }
        this.salud= this.salud + item.getsalud();
        if(this.salud>100){
            this.salud = 100;
        }
    }
    //Establece el valor de la variable Estado dependiendo de las estadisticas de la mascota
    public void Humor(){
        if(this.salud==0 || this.energia==0 || this.edad >= 15){
            this.Estado=EnumEstado.MUERTO;
        }else if(this.energia<= 15){
            this.Estado=EnumEstado.CANSADO;
        }else if(this.edad>5 && this.salud<=30 && this.energia<=30){
            this.Estado=EnumEstado.ENOJADO;
        }else if(this.salud<=20 && this.edad<=5 || this.salud<=50 && this.edad>=5 &&this.edad <=10){
            this.Estado=EnumEstado.HAMBRIENTO;
        }else if(this.felicidad<=20){
            this.Estado=EnumEstado.TRISTE;
        }else if(this.felicidad>=60){
            this.Estado=EnumEstado.FELIZ;
        }else{
            this.Estado=EnumEstado.NEUTRO;
        }
    }
    
    //Disminuye las estadisticas de la mascota y aumenta la edad de la misma una cantidad fija
    public void Vejez(){
        this.edad=this.edad+0.5;
        this.salud=this.salud-5;
        this.energia=this.energia-5;
        this.felicidad=this.felicidad-5;
    }
    
    //se utiliza cada vez que se interactua con un item,
    //ya que segun el enunciado solo con ello pasa el tiempo
    public void aumentarTiempo(){
        this.tiempoSimulacion=this.tiempoSimulacion+0.5;
      }
    
    //Se encarga de revisar las estadisticas de la mascota y actuar en base a ellos
    //se debe aplicar despues de ejecutar la funcion aumentarTiempo()
    public void Estado() {
        //condiciones si los atributos estan en cierto nivel y sus consecuencias 
        if (salud<=10) {
            felicidad=felicidad-20*(int)this.tiempoSimulacion;
            
        }
          
        else if (salud<=50 && edad>5 && edad<=10) {
            energia=energia-20*(int)this.tiempoSimulacion;
            felicidad=felicidad-20*(int)this.tiempoSimulacion;
        }

        else if (salud<=50 && edad>10) {
            energia=energia-20*(int)this.tiempoSimulacion;
            felicidad=felicidad-30*(int)this.tiempoSimulacion;  
        }
      
      //condicional simple para pooner como limite que la energia, felicidad y salud minimo pueden ser 0.
        energia=(energia<0)?0:energia; 
        felicidad=(felicidad<0)?0:felicidad; 
        salud=(salud<0)?0:salud;
   }


}
