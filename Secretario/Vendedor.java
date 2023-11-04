import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {
    private String matriculaCoche;
    private String marcaCoche;
    private String modeloCoche;
    private List<String> listaClientes;
    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario,
                    String matriculaCoche, String marcaCoche, String modeloCoche, String telefonoMovil, String areaVenta, double porcentajeComision) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.listaClientes = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Vendedor");
        System.out.println("Matrícula del coche: " + matriculaCoche);
        System.out.println("Marca del coche: " + marcaCoche);
        System.out.println("Modelo del coche: " + modeloCoche);
    }

    public void darAltaCliente(String cliente) {
        listaClientes.add(cliente);
    }

    public void darBajaCliente(String cliente) {
        listaClientes.remove(cliente);
    }

    public void cambiarCoche(String matriculaCoche, String marcaCoche, String modeloCoche) {
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
    }
}
