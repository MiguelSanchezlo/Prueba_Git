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
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public void establecerEdad(Integer edad){
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
