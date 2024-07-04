import java.util.ArrayList;

public class Abrigo {
    private ArrayList<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("\nNão há animais no abrigo.");
            return;
        }

        ArrayList<Cao> caes = new ArrayList<>();
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Ave> aves = new ArrayList<>();
        ArrayList<Coelho> coelhos = new ArrayList<>();
        ArrayList<Tartaruga> tartarugas = new ArrayList<>();
        ArrayList<Peixe> peixes = new ArrayList<>();

        // Separar os animais por tipo
        for (Animal animal : animais) {
            if (animal instanceof Cao) {
                caes.add((Cao) animal);
            } else if (animal instanceof Gato) {
                gatos.add((Gato) animal);
            } else if (animal instanceof Ave) {
                aves.add((Ave) animal);
            } else if (animal instanceof Coelho) {
                coelhos.add((Coelho) animal);
            } else if (animal instanceof Tartaruga) {
                tartarugas.add((Tartaruga) animal);
            } else if (animal instanceof Peixe) {
                peixes.add((Peixe) animal);
            }
        }

        // Exibir os animais organizados por tipo
        System.out.println("\nCães:");
        for (Cao cao : caes) {
            System.out.println(cao);
        }

        System.out.println("\nGatos:");
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        System.out.println("\nAves:");
        for (Ave ave : aves) {
            System.out.println(ave);
        }

        System.out.println("\nCoelhos:");
        for (Coelho coelho : coelhos) {
            System.out.println(coelho);
        }

        System.out.println("\nTartarugas:");
        for (Tartaruga tartaruga : tartarugas) {
            System.out.println(tartaruga);
        }

        System.out.println("\nPeixes:");
        for (Peixe peixe : peixes) {
            System.out.println(peixe);
        }
    }

    public Animal encontrarAnimalPorNome(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                return animal;
            }
        }
        return null;
    }

    public boolean removerAnimal(Animal animal) {
        return animais.remove(animal);
    }

    // Novo método para verificar se a lista de animais está vazia
    public boolean isVazio() {
        return animais.isEmpty();
    }
}
