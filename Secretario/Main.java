public class Main {
    public static void main(String[] args) {
        // Crear empleados de ejemplo
        Empleado empleado1 = new Empleado("Juan", "Pérez", "12345678A", "Calle 123, Ciudad", 5, "123456789", 2000.0);
        Secretario secretario1 = new Secretario("María", "López", "87654321B", "Av. Principal, Ciudad", 3, "987654321", 1800.0, "Despacho 1", "12345");
        Vendedor vendedor1 = new Vendedor("Pedro", "González", "23456789C", "Calle 456, Ciudad", 2, "678912345", 1500.0, "ABC123", "Toyota", "Corolla", "987654321", "Zona A", 0.05);
        JefeZona jefeZona1 = new JefeZona("Laura", "Martínez", "34567890D", "Av. Secundaria, Ciudad", 8, "543216789", 2500.0, "Despacho 2", secretario1, "DEF456", "Ford", "Focus");

        // Imprimir información de los empleados
        System.out.println("Información de los empleados:");
        empleado1.imprimir();
        System.out.println();
        secretario1.imprimir();
        System.out.println();
        vendedor1.imprimir();
        System.out.println();
        jefeZona1.imprimir();
    }
}
