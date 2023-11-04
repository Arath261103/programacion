package herenciaautos;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anioFabricacion, int numPuertas) {
        super(marca, modelo, anioFabricacion);
        this.numPuertas = numPuertas;
    }

    public void mostrarInformacionCoche() {
        mostrarInformacion();
        System.out.println("Número de puertas: " + numPuertas);
    }
}
