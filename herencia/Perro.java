package herencia;

class Perro extends Animal {
    public Perro(String nombre, String habitat) {
        super(nombre, habitat);
    }

    public void hacerSonido() {
        System.out.println(nombre + " ladra");
    }
}
