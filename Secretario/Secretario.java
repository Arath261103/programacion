public class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Secretario");
        System.out.println("Despacho: " + despacho);
        System.out.println("Número de fax: " + numeroFax);
    }
}
