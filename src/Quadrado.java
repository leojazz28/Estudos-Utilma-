public class Quadrado extends Retangulo {
    
    public Quadrado(Double lado1, String cor ){
        super(lado1, cor);
    }

    @Override
    public Double area(){
        return Math.pow(super.getLado1(), 2);
    }

    @Override
    public String toString() {
        return "Quadrado: "+ this.area();
    }

    
}

