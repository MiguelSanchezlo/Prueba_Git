public class Empleado implements Trabajador{
    private String cargo;
    private String nombre;
    private Integer salario;

    public Empleado(String cargo, String nombre, Integer salario) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void realizarTarea() {
        Trabajador tarea = () -> {
            System.out.println("Realizando tarea laboral.");
        };
    }
}
