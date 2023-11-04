import java.util.Random;
import java.util.Scanner;




public class adivina {
public static  void main(String args[]){
          Scanner sc=new Scanner(System.in);
          Random ran=new Random();

          int ncorrecto=ran.nextInt(100)+1;
          int intentos=0;
          boolean XD = true;

          System.out.println("Bienvenido al programa de adivinar numeros");
          System.out.println("Adivina un numero entre el 1 y el 100");

          while(XD){
            System.out.println("Dame el numero pensado");
            int nsuposicion=sc.nextInt();

            intentos++;

            if(nsuposicion< ncorrecto){
            System.out.println("El numero es mayor");
            }else if(nsuposicion> ncorrecto){
                System.out.println("El numeo es menor");
            }else{
                System.out.println("El numero es correcto!!");
                XD=false;
            }
sc.close();  

          }//





}
 sc.close();   
}
