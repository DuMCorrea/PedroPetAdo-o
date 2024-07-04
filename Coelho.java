public class Coelho extends Animal {
    private String cor;
    private String raca;

    public Coelho(String nome, int idade, String especie, String genero, String cor, String raca) {
        super(nome, idade, especie, genero);
        this.cor = cor;
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String getTipo() {
        return "Coelho";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor: " + cor + ", Raça: " + raca;
    }
}
