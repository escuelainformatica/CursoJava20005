import modelo.Alumno;
import modelo.Curso;
import servicio.AlumnoServicio;

public class Main {
    public static void main(String[] args) {

        AlumnoServicio alumsrv=new AlumnoServicio();
        Alumno john=new Alumno();
        john.setNombre("John");
        john.setApellido("Doe");

        Curso castellano=new Curso("Castellano",5.4);
        john.setCastellano(castellano);

        Curso matematica=new Curso("Matematica",4.0);
        john.setMatematica(matematica);

        Curso historia=new Curso("Historia",3.5);
        john.setHistoria(historia);

        double promedio=alumsrv.promedio(john);
        double notabaja=alumsrv.notaMasBaja(john);
        Curso cursobajo=alumsrv.cursoMasBajo(john);

        alumsrv.mostrar(john);
        System.out.println("el promedio de john es "+promedio);
        System.out.println("la nota mas baja es "+notabaja);
        System.out.println("-------------------------------");
        System.out.println("El curso mas bajo es "+cursobajo.getNombre()+" "+cursobajo.getNota());



    }
}