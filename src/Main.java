import prototype.Camisa;
import proxy.Image;
import proxy.ProxyImage;
import proxy.RealImage;

public class Main {
    public static void main(String[] args) {
        // Testando o padrão Prototype
        Camisa camisaVermelha = new Camisa("Camisa básica", 29.99, "M", "Vermelha");
        Camisa camisaAzul = (Camisa) camisaVermelha.clonar();

        System.out.println("Camisa Vermelha:");
        System.out.println(camisaVermelha);

        System.out.println("\nCamisa Azul:");
        System.out.println(camisaAzul);

        System.out.println("\nPadrão Proxy\n");

        // Testando o padrão Proxy
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();
        image1.display();

        image2.display();
    }
}
