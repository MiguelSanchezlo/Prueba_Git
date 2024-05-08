public class Empleado extends Persona implements Trabajador{
    private String cargo;

    public Empleado(String nombre, String fechaNacimiento, Integer edad) {
        super(nombre, fechaNacimiento, edad);
    }

    @Override
    public void realizarTarea() {
        Trabajador tarea = () -> {
            System.out.println("Realizando tarea laboral.");
        };
    }
}
