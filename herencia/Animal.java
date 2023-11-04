package herencia;

public class Animal {
    String nombre;
    String habitat;

    public Animal(String nombre, String habitat) {
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public void hacerSonido() {
        System.out.println(nombre + " emite sonido");
    }
}
