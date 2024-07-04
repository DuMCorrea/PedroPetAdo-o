public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;
    private String genero; // Novo atributo

    public Animal(String nome, int idade, String raca, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.genero = genero; // Inicializa o novo atributo
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getGenero() {
        return genero;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca + ", Gênero: " + genero;
    }
}
