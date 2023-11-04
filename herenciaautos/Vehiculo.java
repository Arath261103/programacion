package herenciaautos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + anioFabricacion);
    }
}
