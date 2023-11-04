package Clases;
public class Estudiante extends Persona {
    
    private String carrera;//propiedad
    private int legajo;//propiedad

    public Estudiante (){ //constructor
    }
    public String getCarrera () { //asesor a carrera
    return carrera;
    }
    public Void setCarrera (String val) {
        this.carrera = val;
        return null;
    }
    public int getLegajo (){
        return legajo;
    }
    public void setLegajo (int val) {
        this.legajo = val;
    }
}
