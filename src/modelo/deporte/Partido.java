package modelo.deporte;

public class Partido {
    // campos arriba.
    private Equipo local;
    private Equipo visita;
    private int golesLocal;
    private int golesVisita;


    public Partido(Equipo local, Equipo visita, int golesLocal, int golesVisita) {
        this.local = local;
        this.visita = visita;
        this.golesLocal = golesLocal;
        this.golesVisita = golesVisita;
    }

    public Partido() {
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisita() {
        return visita;
    }

    public void setVisita(Equipo visita) {
        this.visita = visita;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisita() {
        return golesVisita;
    }

    public void setGolesVisita(int golesVisita) {
        this.golesVisita = golesVisita;
    }


}
