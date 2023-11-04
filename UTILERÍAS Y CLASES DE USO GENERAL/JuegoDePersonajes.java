class Personaje {
     String nombre;
     String tipo;

    public Personaje(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String Nombre() {
        return nombre;
    }

    public String Tipo() {
        return tipo;
    }
}

public class JuegoDePersonajes {
    public static void main(String[] args) {
        // Crear tres personajes
        Personaje caballero = new Personaje("Sir Lancelot", "Caballero");
        Personaje mago = new Personaje("Merlín", "Mago");
        Personaje ogro = new Personaje("Shrek", "Ogro");
        Personaje Monstruo = new Personaje("Miia", "Lamia");

        // Mostrar información de los personajes
        System.out.println("Personajes en el juego:");
        System.out.println("1. Nombre: " + caballero.Nombre() + ", Tipo: " + caballero.Tipo());
        System.out.println("2. Nombre: " + mago.Nombre() + ", Tipo: " + mago.Tipo());
        System.out.println("3. Nombre: " + ogro.Nombre() + ", Tipo: " + ogro.Tipo());
        System.out.println("4. Nombre: " + Monstruo.Nombre() + ", Tipo: " + Monstruo.Tipo());
    }
}
