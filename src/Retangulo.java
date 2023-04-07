public class Retangulo extends Figura {
    
    private Double lado1;
    private Double lado2;


    public Retangulo(Double lado1, Double lado2,  String cor) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    @Override
    public Double area() {
        return lado1 * lado2 ;
    }

    @Override
    public String toString() {
        return "Retangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }

    

}
