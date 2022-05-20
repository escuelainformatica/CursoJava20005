package modelo;

public class Curso {
    // campos
    private String nombre;
    private double nota;

    // constructores
    public Curso(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Curso() {
    }

    // setter y getter.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
