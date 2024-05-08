public class Estudiante extends Persona {
    private String grado;

    // Constructor propio de la clase
    public Estudiante(String nombre, String fechaNacimiento, Integer edad, String grado) {
        super(nombre, fechaNacimiento, edad);
        this.grado = grado;
    }
    // Constructor heredado
    public Estudiante(String nombre, String fechaNacimiento, Integer edad) {
        super(nombre, fechaNacimiento, edad);
    }

    @Override
    public String toString(){
        return super.toString() + ". El grado que cursa es " + grado;
    }
}
