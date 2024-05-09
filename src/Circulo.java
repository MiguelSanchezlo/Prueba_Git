public class Circulo extends FiguraGeometrica{
    private Float diametro;
    private Float radio;

    public Circulo(String nombre, String color, Float diametro, Float radio) {
        super(nombre, color);
        this.diametro = diametro;
        this.radio = radio;
    }

    public Double areaCirculo (Float radio) {
        final double PI = Math.PI;
        double area = PI * (radio * radio);
        return area;
    }

    public double perimetroCirculo (Float radio) {
        final double PI = Math.PI;
        double perimetro = 2 * PI * radio;
        return perimetro;
    }
}
