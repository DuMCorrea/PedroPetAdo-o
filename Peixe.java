
public class Peixe extends Animal {
    private String cor;
    private String tamanho;

    public Peixe(String nome, int idade, String especie, String genero, String cor, String tamanho) {
        super(nome, idade, especie, genero);
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
        return "Peixe";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor: " + cor + ", Tamanho: " + tamanho;
    }
}
