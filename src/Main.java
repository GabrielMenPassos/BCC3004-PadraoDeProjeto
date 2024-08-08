import prototype.Camisa;

public class Main {
    public static void main(String[] args) {
        Camisa camisaVermelha = new Camisa("Camisa básica", 29.99, "M", "Vermelha");

        Camisa camisaAzul = (Camisa) camisaVermelha.clonar();

        System.out.println("Camisa Vermelha:");
        System.out.println(camisaVermelha);

        System.out.println("\nCamisa Azul:");
        System.out.println(camisaAzul);
    }
}
