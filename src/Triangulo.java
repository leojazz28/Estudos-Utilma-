public class Triangulo extends Figura{

    private  Double base;
    private Double altura;
    
    public Triangulo(Double base, Double altura, String cor ) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        
        return this.base * this.altura / 2;
    }

    @Override
    public String toString() {
        return "Trangulo: "+area();
    }

    
    
}
