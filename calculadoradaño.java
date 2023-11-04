import java.util.Random;
import java.util.Scanner;

public class calculadoradaño {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("BIENVENIDO AL PROGRAMA CALCULADORA DE DAÑO A ENEMIGOS DE VIDEOJUEGOS");
        System.out.println("*********************************************************************");
        System.out.println("Dame el valor que tiene tu arma");
        int valorA = sc.nextInt();

        double aleatorio = 0.5 + ran.nextDouble();
        double cald = valorA * aleatorio;
        System.out.println("El valor de tu arma es " + valorA + ". El daño causado ha sido: " + cald);
        sc.close();
    }
    
}
