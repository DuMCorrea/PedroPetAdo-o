public class Adocao {
    private Adotante adotante;
    private Animal animal;

    public Adocao(Adotante adotante, Animal animal) {
        this.adotante = adotante;
        this.animal = animal;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Adotante: " + adotante + ", Animal: " + animal;
    }
}
