public class Rectangulo extends FiguraGeometrica{
    private Integer lados;
    private Integer altura;
    private Integer ancho;

    public Rectangulo(String nombre, String color) {
        super(nombre, color);
    }

    public Integer areaRectangulo() {
        return (altura * ancho);
    }

    public Integer perimetroRectangulo() {
        Integer perimetro = (2 * altura) + (2 * ancho);
        return perimetro;
    }
}
