import modelo.deporte.Equipo;
import modelo.deporte.Partido;
import servicio.deporte.PartidoServicio;

public class MainDeporte {

    public static void main(String[] args) {

        PartidoServicio ps=new PartidoServicio();

        Equipo wanders=new Equipo();
        wanders.setNombre("Wanders");

        Equipo colo=new Equipo("Colo Colo");
        Equipo uchile=new Equipo("U. Chile");
        Partido partido=new Partido(colo,uchile,3,0);

        Partido partido2=new Partido(new Equipo("Colo colo"),new Equipo("U. Chile"),3,0);

        String ganador=ps.ganador(partido);
        System.out.println("El ganador del primer partido es "+ganador);

        Partido partido3=new Partido(colo,wanders,2,2);
        String ganador3=ps.ganador(partido3);
        System.out.println("El ganador del tercer partido es "+ganador3);


        // 1) hay un problema con el calculo de ganador de un partido.

    }
}
