public class Estudiante extends Persona {
    private String grado;
    public Estudiante(String nombre, String fechaNacimiento, Integer edad, String grado) {
        super(nombre, fechaNacimiento, edad);
        this.grado = grado;
    }
}
