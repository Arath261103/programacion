public class Vehiculo {
    private String marca, modelo;
    private double precioAlquiler;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void setprecioAlquiler(double precioAlquiler){
        this.precioAlquiler = precioAlquiler;
    }
    public void imprimir(){
    System.out.println("Modelo: " +modelo+ " Marca: " +marca+ " Precioalquiler:" +precioAlquiler);
    }
}

public class Autobus extends Vehiculo{
    private int numPlaza;
    public Autobus (String marca, String modelo, double precioAlquiler, int numPlaza){
        super(marca, modelo, precioAlquiler, numPlaza );
        this.numPlaza = numPlaza;
    }
}

public class Turismo extends