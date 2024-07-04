public class Ave extends Animal {
    private String tamanho;

    public Ave(String nome, int idade, String raca, String genero, String tamanho) {
        super(nome, idade, raca, genero);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String getTipo() {
        return "Ave";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho: " + tamanho;
    }
}
