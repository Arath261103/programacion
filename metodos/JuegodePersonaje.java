import java.util.Scanner;

public class JuegodePersonaje{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //se crea una instancia de la clase Scanner llamada scanner. 
        //Esto se hace para que podamos leer la entrada del usuario desde la consola.
        eligirPersonaje(scanner);// Llamar al método para que el usuario elija un tipo de personaje

        scanner.close();

    }
    static void eligirPersonaje(Scanner scanner){
        System.out.println("Bienvenido viajero al mundo perdido antes de comenzar dime el personaje que quieres ser:");
        System.out.println("1.Caballero");
        System.out.println("2.Mago");
        System.out.println("3.Ogro");
        System.out.println("Si escoges otro numero entonces por chistoso te hare una maldicion");
        System.out.println("Dime que personaje vas a hacer");
        int eleccion = scanner.nextInt();
        switch(eleccion){
            case 1:
            System.out.println("Escogiste la clase caballero");
            break;
            case 2:
            System.out.println("Escogiste la clase Mago");
            break;
            case 3:
            System.out.println("Escogiste la clase Ogro");
            break;
            default:
            System.out.println("Te crees muy chistoso entonces te convertire en una rana");
            break;
        }

    }
}