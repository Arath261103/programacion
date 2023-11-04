public class Figura {
    int x, y;

    public void print() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Rectangulo extends Figura {
    int largo, ancho;

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int area() {
        return ancho * largo;
    }
}

class App {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.setX(10);
        r.setY(20);
        r.setLargo(30);
        r.setAncho(40);
        r.print();

        // Calcular y mostrar el área
        int area = r.area();
        System.out.println("Y este es el resultado del área: " + area);
    }
}
