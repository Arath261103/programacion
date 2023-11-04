import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        primeraExcepcion();
        // combinandoExcepciones();
        atrapandoExcepciones();
        // validaPropia();
        mensajeExcepciones();
    }

    public static void primeraExcepcion() {
        String dato = "";
        int convertido = 0;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Introduce un número, lo leeré como cadena y lo convertiré:");
            dato = teclado.nextLine();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer la entrada.");
            return; // Salimos del método en caso de error.
        }

        try {
            convertido = Integer.parseInt(dato);
        } catch (NumberFormatException e) {
            System.out.println("El dato leído no es un número!!");
        } finally {
            System.out.println("Se ejecuta haya excepciones o no, puede servir "
                    + "para cerrar un archivo o una conexión a BD");
        }

        System.out.println("El dato convertido * 10 = " + convertido * 10);
    }

    public static void combinandoExcepciones() {
        String datoLeido = "";
        String datoAux = null;

        try (Scanner teclado = new Scanner(System.in)) {
            datoLeido = teclado.nextLine();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer la entrada.");
            return; // Salimos del método en caso de error.
        }

        if (datoLeido.length() > 5) {
            datoAux = "hola";
        }

        if (datoAux != null) {
            // Realizar acciones adicionales si es necesario
        }
    }

    public static int convertir(String dato) throws NumberFormatException {
        int convertido = 0;
        convertido = Integer.parseInt(dato);
        return convertido;
    }

    public static void atrapandoExcepciones() {
        try {
            System.out.println("Convertido: " + convertir("Palabra"));
        } catch (NumberFormatException e) {
            System.out.println("No puedo realizar la conversión");
        }
    }

    public static void mensajeExcepciones() {
        try {
            System.out.println("Convertido: " + convertir("Hola"));
        } catch (NumberFormatException e) {
            System.out.println("No puedo realizar la conversión");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static class MiExcepcion extends Exception {
        public MiExcepcion(String mensajeError) {
            super(mensajeError);
        }
    }

    public static void validaPropia() {
        int n = 5;
        try {
            minimo(n);
            System.out.println(n + " es mayor a 10");
        } catch (MiExcepcion e) {
            System.out.println("No me sirve ese número");
        }
    }

    public static void minimo(int numero) throws MiExcepcion {
        if (numero <= 10) {
            throw new MiExcepcion("Necesito un número mayor a 10");
        }
    }
}
