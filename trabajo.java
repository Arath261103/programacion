import java.util.Random; //biblioteca
import java.util.Scanner;


public class trabajo{


    public static void main (String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            Random ran=new Random();

 
            System.out.println("BIENVENIDO AL PROGRAMA CALCULADORA DE DAÑO A ENEMIGOS DE VIDEOJUEGOS");
            System.out.println("*********************************************************************");
            System.out.println("Dame el valor que tiene tu arma");
            int valorA=sc.nextInt();

            double Aleatorio=0.5+ran.nextDouble();
            double Cald=valorA*Aleatorio;
            System.out.println("El valor de tu arma es" + valorA + "El dano causado ha sido!" + Cald);
        }
    }
} 