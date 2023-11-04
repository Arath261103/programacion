class Persona {
    String nombre;
    String apellido;
    String estadoCivil;
    int numeroIdentificacion;

    public Persona(String nombre, String apellido, int numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido +
                ", Número de Identificación: " + numeroIdentificacion +
                ", Estado Civil: " + estadoCivil;
    }
}

class Empleado extends Persona {
    private int anoIncorporacion;
    private String numDespacho;

    public Empleado(String nombre, String apellido, int numeroIdentificacion, String estadoCivil, int anoIncorporacion, String numDespacho) {
        super(nombre, apellido, numeroIdentificacion, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numDespacho = numDespacho;
    }

    public void reasignarDespacho(String nuevoDespacho) {
        this.numDespacho = nuevoDespacho;
    }
}

class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellido, int numeroIdentificacion, String estadoCivil, String curso) {
        super(nombre, apellido, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public void reasignarCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }
}

class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, String apellido, int numeroIdentificacion, String estadoCivil, String departamento) {
        super(nombre, apellido, numeroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public void reasignarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }
}

class PersonalDeServicio extends Persona {
    private String seccion;

    public PersonalDeServicio(String nombre, String apellido, int numeroIdentificacion, String estadoCivil, String seccion) {
        super(nombre, apellido, numeroIdentificacion, estadoCivil);
        this.seccion = seccion;
    }

    public void reasignarSeccion(String nuevoSeccion) {
        this.seccion = nuevoSeccion;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Loza", 345233, "casado", 2000, "Despacho 3");
        Estudiante estudiante1 = new Estudiante("Maria", "Gonzales", 383949, "Soltero", "matematicas");
        Profesor profesor1 = new Profesor("Kazuma", "Morales", 343234, "Soltero", "Literatura");
        PersonalDeServicio personalDeServicio1 = new PersonalDeServicio("Luis", "Velez", 234234, "casado", "cocina");

        empleado1.reasignarDespacho("Despacho 38383");
        estudiante1.reasignarCurso("aritmetica");
        profesor1.reasignarDepartamento("geometria");
        personalDeServicio1.reasignarSeccion("limpieza");
    

        System.out.println("Información de la escuela:");
        System.out.println("Empleado: " + empleado1);
        System.out.println("Estudiante: " + estudiante1);
        System.out.println("Profesor: " + profesor1);
        System.out.println("Personal de servicio: " + personalDeServicio1);
    }
}
