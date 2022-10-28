package CasoIntranet;

public class Alumno {
    private String nombre, apellido, rut, nMatricula;

    public Alumno (String nombre, String apellido, String rut, String nMatricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.nMatricula = nMatricula;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(String nMatricula) {
        this.nMatricula = nMatricula;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" "+this.apellido;
    }
}
