package modelo;

public class Alumno {
    private String nombre;
    private String apellido;
    private Curso castellano;
    private Curso matematica;
    private Curso historia;

    public Alumno(String nombre, String apellido, Curso castellano, Curso matematica, Curso historia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.castellano = castellano;
        this.matematica = matematica;
        this.historia = historia;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Curso getCastellano() {
        return castellano;
    }

    public void setCastellano(Curso castellano) {
        this.castellano = castellano;
    }

    public Curso getMatematica() {
        return matematica;
    }

    public void setMatematica(Curso matematica) {
        this.matematica = matematica;
    }

    public Curso getHistoria() {
        return historia;
    }

    public void setHistoria(Curso historia) {
        this.historia = historia;
    }
}
