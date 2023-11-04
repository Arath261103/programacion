package herenciafiguras;

public class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0;  // Por defecto, el área es 0
    }
}
