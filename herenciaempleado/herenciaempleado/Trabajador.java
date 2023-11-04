package herenciaempleado;


public class Trabajador extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public Trabajador(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * tarifaHora);
    }

    public String obtenerRol() {
        return "Trabajador";
    }
}
