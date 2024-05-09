public class Gerente extends Empleado{
    public Gerente(String cargo, String nombre, Float salario) {
        super(cargo, nombre, salario);
    }

    @Override
    public Float calcularSalario() {
        Float salario = 1500000F;
        Float bono = 250000F;
        return salario + bono;
    }
}
