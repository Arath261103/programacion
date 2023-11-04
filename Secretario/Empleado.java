public class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double salario;
    public Empleado(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("DNI: " + DNI);
        System.out.println("Dirección: " + direccion);
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario + " euros");
    }

    public void cambiarSupervisor(Empleado nuevoSupervisor) {
    }

    public void incrementarSalario(double porcentaje) {
        salario *= (1 + porcentaje / 100);
    }
}
