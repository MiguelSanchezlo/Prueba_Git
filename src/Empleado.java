public class Empleado implements Trabajador{
    private String cargo;
    private String nombre;
    private Float salario;

    public Empleado(String cargo, String nombre, Float salario) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Float calcularSalario() {
        return this.salario;
    }

    @Override
    public void realizarTarea() {
        Trabajador tarea = () -> {
            System.out.println("Realizando tarea laboral.");
        };
    }
}
