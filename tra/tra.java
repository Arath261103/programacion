package tra;
import java.util.Scanner;

public class tra {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int x, y;

            System.out.println("Introduzca el valor de x: ");
            x = teclado.nextInt();

            System.out.println("Introduzca el valor de y: ");
            y = teclado.nextInt();

            suma sumador = new suma();
            int suma = sumador.sumar(x, y);

            System.out.println("La suma es: " + suma);
        }
    }
}
