package Persona;
import Clases.Estudiante;
import Clases.Persona;
import Clases.Profesor;

public class App {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Pepe");
        p.setEdad(25);

        Estudiante e = new Estudiante();
        e.setNombre("Arath");
        e.setLegajo(434534);
        e.setCarrera("Videojuegos");

        Profesor pro = new Profesor();
        pro.setNombre("Nicolas");
        pro.setMateria("Natacion");
        pro.setCargo("Adjunto");

        System.out.println("Objeto p de tipo Persona");
        System.out.printf("Nombre: %s, Edad: %d%n", p.getNombre(), p.getEdad());

        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, Carrera: %s, Legajo: %d%n", e.getNombre(), e.getCarrera(), e.getLegajo());

        System.out.println("Objeto pro de tipo Profesor");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s%n", pro.getNombre(), pro.getMateria(), pro.getCargo());
    }
}
