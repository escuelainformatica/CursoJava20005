package servicio;

import modelo.Alumno;
import modelo.Curso;
import org.jetbrains.annotations.NotNull;

public class AlumnoServicio {


    public double promedio(Alumno alu) {
        double resultado=0;
        resultado=(alu.getCastellano().getNota()+alu.getHistoria().getNota()+alu.getMatematica().getNota())/3;
        return resultado;
    }
    public double notaMasBaja(Alumno alu) {
        double resultado=0;
        if(alu.getCastellano().getNota()<alu.getMatematica().getNota()
                && alu.getCastellano().getNota()<alu.getHistoria().getNota()) {
            resultado=alu.getCastellano().getNota();
        }
        if(alu.getMatematica().getNota()<alu.getCastellano().getNota()
                && alu.getMatematica().getNota()<alu.getHistoria().getNota()) {
            resultado=alu.getMatematica().getNota();
        }
        if(alu.getHistoria().getNota()<alu.getCastellano().getNota()
                && alu.getHistoria().getNota()<alu.getMatematica().getNota()) {
            resultado=alu.getHistoria().getNota();
        }
        return resultado;
    }

    public Curso cursoMasBajo(Alumno alu) {
        Curso resultado=new Curso();
        if(alu.getCastellano().getNota()<alu.getMatematica().getNota()
                && alu.getCastellano().getNota()<alu.getHistoria().getNota()) {
            resultado=alu.getCastellano();
        }
        if(alu.getMatematica().getNota()<alu.getCastellano().getNota()
                && alu.getMatematica().getNota()<alu.getHistoria().getNota()) {
            resultado=alu.getMatematica();
        }
        if(alu.getHistoria().getNota()<alu.getCastellano().getNota()
                && alu.getHistoria().getNota()<alu.getMatematica().getNota()) {
            resultado=alu.getHistoria();
        }
        return resultado;
    }


    public void mostrar(Alumno alumno) {
        System.out.println("Alumno: "+alumno.getNombre()+" "+alumno.getApellido());
        System.out.println("Alumno: Curso #1 "+
                alumno.getCastellano().getNombre()+
                " "+
                alumno.getCastellano().getNota());
        System.out.println("Alumno: Curso #2 "+
                alumno.getMatematica().getNombre()+
                " "+
                alumno.getMatematica().getNota());
        System.out.println("Alumno: Curso #3 "+
                alumno.getHistoria().getNombre()+
                " "+
                alumno.getHistoria().getNota());
    }




}
