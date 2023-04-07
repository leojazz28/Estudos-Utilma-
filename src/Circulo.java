public class Circulo extends Figura {

    private Double raio;
    private static final Double  PI = 3.14;


    public Circulo (Double raio, String cor) {
        super(cor);
        this.raio = raio;
    }


    @Override
    public Double area() {
        return PI * (Math.pow(this.raio, 2));
    }


    
}
