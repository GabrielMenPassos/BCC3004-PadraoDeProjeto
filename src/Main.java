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

        // Testando o padrão Proxy
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        System.out.println("\nDisplaying image1:");
        image1.display(); // A imagem será carregada e exibida

        System.out.println("\nDisplaying image1 again:");
        image1.display(); // A imagem já está carregada, não será carregada novamente

        System.out.println("\nDisplaying image2:");
        image2.display(); // A imagem será carregada e exibida
    }
}
