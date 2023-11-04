package herencia;

public class Herencia {
    public static void main(String[] args) {
        String nombre = "Peque";
        String habitat = "casa";
        Perro perro = new Perro(nombre, habitat);

        perro.hacerSonido();
    }
}
