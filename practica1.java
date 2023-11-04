//6.Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
import java.util.Scanner;
public class practica1 {
    public static void main(String[] args){
        int  x;
        Scanner sc =new Scanner(System.in);
        System.out.println("Porfavor digame su calificacion y dependiendo de como le valla sacara ");
        System.out.println("inserte su calificacion: ");
        x = sc.nextInt();
        if(x == 0 ){
            System.out.println("Lo siento pero reprobaste");
        }
        else if(x <= 5){
            System.out.println("tu calificacion fue insuficiente");
        }
        else if(x <= 8){
            System.out.println("Tu calificacion es suficiente");
        }
        else if(x == 9){
            System.out.println("Tu calificacion fue buena");
        }
        else if(x == 10){
            System.out.println("Felicidades aprobaste la materia");
        }
        if(x > 10){
            System.out.println("ay carray este salio mago");
        }
        sc.close();


    }
}
