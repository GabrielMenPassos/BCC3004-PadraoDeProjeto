package prototype;

public class Camisa implements Produto {
    private String nome;
    private double preco;
    private String tamanho;
    private String cor;

    public Camisa(String nome, double preco, String tamanho, String cor) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public Produto clonar() {
        Camisa clone = new Camisa(nome, preco, tamanho, cor);
        clone.cor = "Azul";
        return clone;
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "nome='" + nome + '\'' +
                ", preco=" + " " + preco +
                ", tamanho='" + tamanho + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
