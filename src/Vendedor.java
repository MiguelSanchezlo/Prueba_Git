public class Vendedor extends Empleado{
    public Vendedor(String cargo, String nombre, Float salario) {
        super(cargo, nombre, salario);
    }

    @Override
    public Float calcularSalario() {
        Float salario = 1300000F;
        Float ventasTotales = 10000000F;
        Float comision = (float) (ventasTotales * 0.03);
        return salario + comision;
    }
}
