import java.util.Scanner;

class Objeto {
    private String nombre;
    
    public Objeto(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}

class Usuario {
    private int puntos;
    
    public Usuario() {
        puntos = 0;
    }
    
    public void recogerObjeto(Objeto objeto) {
        System.out.println("Has recogido un " + objeto.getNombre());
        puntos += 10; // Incrementar los puntos por cada objeto recogido
        System.out.println("Puntos totales: " + puntos);
    }
}

public class SimuladorRecogidaObjetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        
        while (true) {
            System.out.print("Ingresa el nombre del objeto (o 'salir' para terminar): ");
            String nombreObjeto = scanner.nextLine();
            
            if (nombreObjeto.equalsIgnoreCase("salir")) {
                break;
            }
            
            Objeto objeto = new Objeto(nombreObjeto);
            usuario.recogerObjeto(objeto);
        }
        
        System.out.println("¡Fin del juego!");
    }
}

