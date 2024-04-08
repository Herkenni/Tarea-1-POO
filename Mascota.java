package Java.Tarea1;

/**
 * Mascota
 */
public class Mascota {

    ///Atributos
    String nombre;
    int edad;
    int salud;
    int energia;
    int felicidad;
    String Estado;

    //metodos constructores

    public Mascota(){ ///constructor para "setear" una mascota
    }

    public Mascota(String nombre, String Estado){ //constructor para crear una mascota parametrizada
        this.nombre=nombre;
        this.edad=0;
        this.salud=100;
        this.energia=100;
        this.felicidad=50;
        this.Estado="(-_-) Meh...";

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

    public void setEstado(String estado) {
        Estado = estado;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    //metodos getters

    public int getEdad() {
        return edad;
    }

    public int getEnergia() {
        return energia;
    }

    public String getEstado() {
        return Estado;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }


    ///metodos

    public String Estado(Mascota pet){ //pasamos como parametro un objeto de tipo Mascota

        //obtenemos valor de atributos de aquella mascota
        int energia = pet.getEnergia();
        int felicidad = pet.getFelicidad();
        int salud = pet.getSalud();
        int edad = pet.getEdad();

        //vemos condiciones a cumplir entre atributos
        //cuya relacion despues determinará su estado

        if (salud<=10) {

            ///disminucion generica, ya que en realidad 
            ///disminuye por cada incremento de tiempo de ejecucion
            felicidad=felicidad-20; 
            pet.setFelicidad(felicidad);
        }

        else if (salud<=50 && edad>5 && edad<=10) {
            
            //misma analogia, los decrementos se tienen
            // que hacer por tiempo de simulacion, esto es solo generico
            energia=energia-20;
            felicidad=felicidad-20;
            pet.setEnergia(energia);
            pet.setFelicidad(felicidad);

        }

        else if (salud<=50 && edad>10) {
            //decremento igual que los anteriore(por tiempo de simulacion)
            //estos numeros que se restan son solo para mostrar una representacion
            energia=energia-20;
            felicidad=felicidad-30;
            pet.setEnergia(energia);
            pet.setFelicidad(felicidad);            
        }



        //hacer condicionales tenidos los valores finales
        //de la energia, felicidad, salud, donde 
        //cada if tendra su propio retorno que son los siguientes:
        
        return "(-_-) Meh.... ";

        return "/(^_^)/ Weeeeeh!";

        return "(._.) snif.... ";

        return "(0o0) hambre hambre!";

        return "(ôwô) grrrr....";

        return "(=_=) zzzz.... ";

        return "(x_x) fin del juego";

        return "(-.-)";
    }

}