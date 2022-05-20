package servicio.deporte;

import modelo.deporte.Partido;

public class PartidoServicio {

    public String ganador(Partido part) {
        String resultado="";
        if(part.getGolesLocal()>part.getGolesVisita()) {
            resultado=part.getLocal().getNombre();
        } else {
            resultado=part.getVisita().getNombre();
        }
        return resultado;
    }
}
