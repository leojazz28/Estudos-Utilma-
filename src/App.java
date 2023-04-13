public class App {
    public static void main(String[] args) throws Exception {
        
        Figura figura = new Retangulo(5.0, 2.0, "Black");
        System.out.println("Reytangulo: "+figura.area());

        figura = new Quadrado(4.0, "Black");
        System.out.println("Quadrado: "+ figura.area());

        figura = new Circulo(6.0, "Black");
        System.out.println("Circulo: "+ figura.area());

        figura = new Triangulo(4.0, 10.0,"Black" );
        System.out.println("Circulo: "+ figura.area());

       


    }
}
