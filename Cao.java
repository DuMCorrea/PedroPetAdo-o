public class Cao extends Animal {
    private String cor;
    private String tamanho;

    public Cao(String nome, int idade, String raca, String genero, String cor, String tamanho) {
        super(nome, idade, raca, genero);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String getTipo() {
        return "Cão";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor: " + cor + ", Tamanho: " + tamanho;
    }
}
