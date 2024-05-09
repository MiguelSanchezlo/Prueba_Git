public class Triangulo extends FiguraGeometrica{
    private Float lado1;
    private Float lado2;
    private Float lado3;
    private Float altura;
    private Float ancho;

    public Triangulo(String nombre, String color, Float lado1, Float lado2, Float lado3, Float altura, Float ancho) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.ancho = ancho;
    }

    public Float areaTriangulo (Float altura, Float ancho) {
        Float area = (ancho * altura) / 2;
        return area;
    }

    public Float perimetroTriangulo (Float lado1, Float lado2, Float lado3) {
        Float perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
}
