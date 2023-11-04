package herenciaautos;

public class Motocicleta extends Vehiculo {
    private boolean esElectrica;

    public Motocicleta(String marca, String modelo, int anioFabricacion, boolean esElectrica) {
        super(marca, modelo, anioFabricacion);
        this.esElectrica = esElectrica;
    }

    public void mostrarInformacionMotocicleta() {
        mostrarInformacion();
        System.out.println("Es eléctrica: " + (esElectrica ? "Sí" : "No"));
    }
}
