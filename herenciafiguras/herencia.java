package herenciafiguras;

public class herencia {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo", 3.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 4.0, 5.0);

        double areaCirculo = circulo.calcularArea();
        double areaRectangulo = rectangulo.calcularArea();

        System.out.println("Área del " + circulo.nombre + ": " + areaCirculo);
        System.out.println("Área del " + rectangulo.nombre + ": " + areaRectangulo);
    }
}
