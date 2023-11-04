import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {
    private String despacho;
    private List<Vendedor> listaVendedores;
    public JefeZona(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario,
                    String despacho, Secretario secretario, String matriculaCoche, String marcaCoche, String modeloCoche) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.listaVendedores = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de Zona");
        System.out.println("Despacho: " + despacho);
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
    }

    public void cambiarCoche(String matriculaCoche, String marcaCoche, String modeloCoche) {
    }

    public void darAltaVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        listaVendedores.remove(vendedor);
    }
}
