import java.util.Scanner;

public class Abstracto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner
        int x;
        carnivoros ac = new carnivoros();
        invetebrado ainv = new invetebrado();
        Vertebrado av = new Vertebrado();

        System.out.println("Bienvenido al zoologico de San Miguel");
        System.out.println("Dime a qué tipo de animal quieres ver");
        System.out.println(" 1.Carnivoros " + " 2.Vertebrados " + " 3.Invertebrados ");
         x = scanner.nextInt();

         switch (x) {
            case 1:
            System.out.println ("Vienvenido a los animales carnivoros");
             ac.comer();
             ac.nombre("Tiburoncin");
            ac.cantdientes(8);
                break;
                 case 2:
            System.out.println ("Vienvenido a los animales vertebrados");
              av.comer();
              av.nombre("crash");
              av.tipo("Ave");
                break;
                case 3:
            System.out.println ("Vienvenido a los animales Invertebrados");
              ainv.comer();
        ainv.nombre("medusin");
        ainv.canojos(15);
                break;

                default:
                System.out.println("Solo tenemos 3 tipos de animales por favor fuera de aqui");
         }
        scanner.close();  // Cerrar el scanner
    }
}
