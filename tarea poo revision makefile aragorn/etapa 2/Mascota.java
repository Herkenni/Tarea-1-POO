
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
    protected double edad; //se coloca en las mismas unidades que el tiempo ya que eso piden en el enunciado

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
        //this.tiempoSimulacion=0;
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
    public void Aumentar(Item item){
        //se identifica el tipo de item que se va a usar
        Class<? extends Item> clase = item.getClass();
        //System.out.println("Clase del objeto: " + clase.getSimpleName()+"\n");
        if (clase.getSimpleName().equals("Comida")){
            //System.out.println("Comida");
            int energia_restauradad=item.getenergia()+this.energia;
            int salud_restaurada=item.getsalud()+this.salud;
            if(energia_restauradad>100){
                this.setEnergia(100);
            }else{
                this.setEnergia(energia_restauradad);
            }
            if(salud_restaurada>100){
                this.setSalud(100);
            }else{
                this.setSalud(salud_restaurada);
            }
        }
        else if (clase.getSimpleName().equals("Medicina")){
            //System.out.println("Medicina");
            int salud_restaurada=item.getsalud()+this.salud;
            if(salud_restaurada>100){
                this.setSalud(100);
            }else{
                this.setSalud(salud_restaurada);
            }
        }
        else if (clase.getSimpleName().equals("Juguete")){
            //System.out.println("Juguete");
            int felicidad_restaurada=item.getfelicidad()+this.felicidad;
            if(felicidad_restaurada>100){
                this.setFelicidad(100);
            }else{
                this.setFelicidad(felicidad_restaurada);
            }
        }

    }
}
