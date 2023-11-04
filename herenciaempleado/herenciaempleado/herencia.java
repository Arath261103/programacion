package herenciaempleado;

public class herencia {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 50000, 10000);
        Trabajador trabajador = new Trabajador("Ana", 30000, 40, 20);

        double salarioGerente = gerente.calcularSalario();
        double salarioTrabajador = trabajador.calcularSalario();

        System.out.println(gerente.nombre + " es un " + gerente.obtenerRol() + " y su salario es: $" + salarioGerente);
        System.out.println(trabajador.nombre + " es un " + trabajador.obtenerRol() + " y su salario es: $" + salarioTrabajador);
    }
}
