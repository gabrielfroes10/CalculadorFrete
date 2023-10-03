public class Produto {
    private double peso;
    private double altura;
    private double largura;
    private double preco;
    private int tipoEnvio;

    public Produto(double peso, double altura, double largura, double preco) {
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.preco = preco;
    }


    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getPreco() {
        return preco;
    }
}
