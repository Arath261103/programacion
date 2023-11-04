public class sumayresta {
    public static void main(String[] args) {
        sumaresta sr = new sumaresta();
        sr.n1 = 5;
        sr.n2 = 6;
        System.out.println("n1: " + sr.n1);
        System.out.println("n2: " + sr.n2);

        // Método para la suma
        int resultadoSuma = sr.sumar(5, 6);
        System.out.println("Suma(5, 6): " + resultadoSuma);

        // Método para la resta
        float resultadoResta = sr.restar(5f, 6f);
        System.out.println("Resta(5f, 6f): " + resultadoResta);
    }
}
