package CasoIntranet;

public class Principal {

    public static void main(String[] args) {
        CasoIntranet.Principal launcher = new Principal();
        launcher.inicializar();
    }

    public void inicializar(){
        Curso curso = new Curso();
        curso.agregarAlumno("Leo","Roa","211934875","21193487521");
        curso.agregarAlumno("Alumno1","Apellido1","210000001","21000000121");
        curso.agregarAlumno("Alumno2","Apellido2","210000002","21000000221");
        System.out.println("Alumnos de la clase: ");
        curso.mostrarCurso();

        //Eliminar alumno
        curso.eliminarAlumno("Leo","roa");
        System.out.println("============================");
        curso.mostrarCurso();
        //Volver a agregar
        curso.agregarAlumno("Leo","Roa","211934875","21193487521");

        System.out.println("============================");
        curso.buscarAlumnoRut("211934875");
        curso.buscarAlumnoRut("210000001");
    }

}
