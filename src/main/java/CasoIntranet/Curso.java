package CasoIntranet;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Alumno> alumnos;
    public Curso(){
        this.alumnos = new ArrayList<>();
    }

    public Alumno buscarAlumno(String nombre, String apellido){
        for (Alumno alumno : alumnos ){
            if (alumno.getNombre().equalsIgnoreCase(nombre) && alumno.getApellido().equalsIgnoreCase(apellido)){
                return alumno;
            }
        }
        return null;
    }

    public void mostrarCurso(){
        for (Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }
    }

    public boolean agregarAlumno (String nombre, String apellido, String rut, String nMatricula){
        if (buscarAlumno(nombre, apellido) == null ){
            Alumno alumno = new Alumno (nombre, apellido, rut, nMatricula);
            this.alumnos.add(alumno);
            return true;
        }
        return false;
    }

    public boolean eliminarAlumno (String nombre, String apellido){
        Alumno alumno = this.buscarAlumno(nombre, apellido);
        if (alumno != null){
            this.alumnos.remove(alumno);
            return true;
        }
        return false;
    }

    public void buscarAlumnoRut (String rut){
        for (Alumno alumno : alumnos ){
            if (alumno.getRut().equals(rut)){
                System.out.println("Alumno encontrado, "+alumno);
            }
        }
    }

}
