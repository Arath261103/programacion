package herenciaautos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2022, 4);
        Motocicleta moto = new Motocicleta("Honda", "CBR500R", 2021, true);

        System.out.println("Información del coche:");
        coche.mostrarInformacionCoche();
        System.out.println("\nInformación de la motocicleta:");
        moto.mostrarInformacionMotocicleta();
    }
}
