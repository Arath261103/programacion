//4.Pedir dos números y decir cual es el mayor
import java.util.Scanner;
public class practica2 {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor introduce el primer numero: ");
        a=sc.nextInt();
        System.out.println("Ahora introduce el segundo numero: ");
        b=sc.nextInt();
        if(a<b){
            System.out.println("tu numero mayor es " + b + " y el menor es el " + a);
        }
        else{
            System.out.println("tu numero mayor es " + a + " y el numero menor es el " + b);
        }
        if(a == b){
            System.out.println("Los dos numeros son iguales");
        }
        sc.close();
    }
    
}
