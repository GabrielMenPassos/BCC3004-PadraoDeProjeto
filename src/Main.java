import prototype.Camisa; // Importa a classe do padrão Prototype
import proxy.Image;      // Importa a interface do padrão Proxy
import proxy.ProxyImage; // Importa a classe Proxy do padrão Proxy
import proxy.RealImage;  // Importa a classe RealImage do padrão Proxy

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
