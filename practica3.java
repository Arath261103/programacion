//2.Pedir dos números y decir si son iguales o no.
import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        do {
            System.out.print("Ingresa el primer digito: ");
            n1=sc.nextInt();
            
            System.out.print("Ingresa el segundo digito: ");
            n2=sc.nextInt();
            
            if(n1==n2){
                System.out.println("Los números son iguales.");
            }else{
                System.out.println("Los números no son iguales.");
            }
            
            System.out.print("quieres comparar otros números? (1 sí, 0 no): ");
            int cierre=sc.nextInt();
            
            if (cierre!=1) {
                break;
            }
        } while(true);
        System.out.println("Ya te vas?... al chile que bueno");
        sc.close();
    } 
}