Carlos López   201830033-0
Nicolás Figueroa 201704118-8
Alonso Castillo Pinto 202004589-5
Juan Carlos Gutiérrez 201930041-5

Compilación:
-make: Usa el default que es compile
-make compile: Compila todos los archivos .java que se encuentran en la carpeta en donde se ubica el makefile y sean los .java asociados a la Etapa3 que se especifican dentro del makefile.
-make run: Ejecuta el programa Javation
-make clena: Borra todos los archivos .class que se ubican en la misma ruta que el makefile
	-Los archivos que se ocupan en esta etapa son:
			-Main.java 
			-EnumEstado.java 
			-Mascota.java 
			-Item.java 
			-Comida.java 
			-Juguete.java 
			-Medicina.java
			-Inventario.java

Función del programa:
-El código crea una instancia de la mascota y del inventario.
-Se establecen los atributos iniciales de la mascota.
-Se muestran las características de la mascota y del inventario.
-Se inicia un bucle que permite al usuario interactuar con la mascota y el inventario.
-En cada iteración del bucle:
	-Se muestra el estado actual de la mascota y del inventario.
	-Se solicita al usuario que seleccione un ítem del inventario.
	-Se utiliza el ítem seleccionado en la mascota, actualizando sus atributos y la cantidad de ítems en el inventario.
	-Se incrementa el tiempo de simulación.