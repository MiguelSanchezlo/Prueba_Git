public class Persona {
    private String nombre;
    private String fechaNacimiento;
    private Integer edad;

    public Persona(String nombre, String fechaNacimiento, Integer edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public void establecerNombre(String nombre){
        for (char caracters : nombre.toCharArray()){
            if (Character.isDigit(caracters)) {
                System.out.println("El nombre no puede tener numeros.");
            }
        }
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public void establecerEdad(Integer edad){
        if(edad < 0){
            String mensaje = "La edad no puede ser un numero negativo";
        }
        this.edad = edad;
    }

    public Integer obtenerEdad(){
        return this.edad;
    }

    public void establecerFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String ObtenerFechaNacimiento(){
        return this.fechaNacimiento;
    }
}
