public class Tartaruga extends Animal {
    public Tartaruga(String nome, int idade, String especie, String genero) {
        super(nome, idade, especie, genero);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTipo() {
        return "Tartaruga";
    }
}
