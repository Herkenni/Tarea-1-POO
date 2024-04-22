JFLAGS = -g
JC = javac
JVM = java
FILE =
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
CLASSES = \
    Main.java \
	EnumEstado.java \
    Mascota.java \
	Item.java \
	Comida.java \
	Juguete.java \
	Medicina.java \
	Inventario.java \
	

MAIN = Main

default: classes

classes: $(CLASSES:.java=.class)

run: classes
	$(JVM) $(MAIN) config.csv

clean:
	$(RM) *.class
	