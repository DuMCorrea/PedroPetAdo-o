import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abrigo abrigo = new Abrigo();

        // Mensagem de boas-vindas
        System.out.println("\nBoas-vindas à PedroPetAdoção!");
        System.out.println("\nSomos um abrigo de animais sem donos, que por algum motivo, estão abandonados e sem uma família.");
        System.out.println("\nCaso você queira registrar um animal sem dono ou adotar um, você está no lugar certo!");
        System.out.println("\nTransformamos histórias de abandono em histórias de amor e adoção.");
        System.out.println("\nAperte Enter para seguir para o Menu.");
        scanner.nextLine(); // Aguarda o usuário pressionar Enter

        limparTela();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar animais");
            System.out.println("3. Adotar animal");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    adicionarAnimal(scanner, abrigo);
                    break;
                case 2:
                    abrigo.listarAnimais();
                    break;
                case 3:
                    adotarAnimal(scanner, abrigo);
                    break;
                case 4:
                    System.out.println("\nObrigado por ter nos visitado, até logo!");
                    System.out.println("\nSaindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }

    private static void limparTela() {
        // Imprime 50 linhas em branco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static void adicionarAnimal(Scanner scanner, Abrigo abrigo) {
        System.out.println("\nSelecione o tipo de animal:");
        System.out.println("1. Cão");
        System.out.println("2. Gato");
        System.out.println("3. Ave");
        System.out.println("4. Coelho");
        System.out.println("5. Tartaruga");
        System.out.println("6. Peixe");

        int tipo = -1;
        while (tipo < 1 || tipo > 6) {
            if (scanner.hasNextInt()) {
                tipo = scanner.nextInt();
            } else {
                scanner.next(); // consumir a entrada inválida
            }
            if (tipo < 1 || tipo > 6) {
                System.out.println("\nTipo inválido. Tente novamente.");
            }
        }
        scanner.nextLine(); // Consome a nova linha

        System.out.println("\nDigite o nome do animal:");
        String nome = scanner.nextLine();
        System.out.println("Digite a raça/espécie do animal:");
        String raca = scanner.nextLine();
        System.out.println("Digite a idade do animal (Se não souber, digite 0):");
        int idade = -1;
        while (idade < 0) {
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
            } else {
                scanner.next(); // consumir a entrada inválida
            }
            if (idade < 0) {
                System.out.println("\nIdade inválida. Tente novamente.");
            }
        }
        scanner.nextLine(); // Consome a nova linha

        System.out.println("Digite o gênero do animal (macho/fêmea):");
        String genero = scanner.nextLine();

        Animal animal = null;

        switch (tipo) {
            case 1:
                System.out.println("Digite a(s) cor do cão:");
                String corCao = scanner.nextLine();
                System.out.println("Digite o tamanho (porte) do cão:");
                String tamanhoCao = scanner.nextLine();
                animal = new Cao(nome, idade, raca, genero, corCao, tamanhoCao);
                break;
            case 2:
                System.out.println("Digite a(s) cor do gato:");
                String corGato = scanner.nextLine();
                System.out.println("Digite o tamanho (porte) do gato:");
                String tamanhoGato = scanner.nextLine();
                animal = new Gato(nome, idade, raca, genero, corGato, tamanhoGato);
                break;
            case 3:
                System.out.println("Digite o tamanho (porte) da ave:");
                String tamanhoAve = scanner.nextLine();
                animal = new Ave(nome, idade, raca, genero, tamanhoAve);
                break;
            case 4:
                System.out.println("Digite a cor do coelho:");
                String corCoelho = scanner.nextLine();
                System.out.println("Digite a raça do coelho:");
                String racaCoelho = scanner.nextLine();
                animal = new Coelho(nome, idade, raca, genero, corCoelho, racaCoelho);
                break;
            case 5:
                animal = new Tartaruga(nome, idade, raca, genero);
                break;
            case 6:
                System.out.println("Digite a cor do peixe:");
                String corPeixe = scanner.nextLine();
                System.out.println("Digite o tamanho (porte) do peixe:");
                String tamanhoPeixe = scanner.nextLine();
                animal = new Peixe(nome, idade, raca, genero, corPeixe, tamanhoPeixe);
                break;
        }

        abrigo.adicionarAnimal(animal);
        System.out.println("\nAnimal adicionado ao abrigo com sucesso! " + "\n" + animal + "\n");
    }

    private static void adotarAnimal(Scanner scanner, Abrigo abrigo) {
        if (abrigo.isVazio()) {
            System.out.println("\nNão há nenhum animal no abrigo.");
            return;
        }

        System.out.println("\nDigite o nome do animal a ser adotado:");
        String nomeAnimal = scanner.nextLine();
        Animal animal = abrigo.encontrarAnimalPorNome(nomeAnimal);

        if (animal == null) {
            System.out.println("\nAnimal não encontrado.");
            return;
        }

        System.out.println("\nDigite o nome completo do adotante:");
        String nomeAdotante = scanner.nextLine();
        System.out.println("Digite o CPF do adotante:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o telefone do adotante:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email do adotante:");
        String email = scanner.nextLine();

        Adotante adotante = new Adotante(nomeAdotante, cpf, telefone, email);
        Adocao adocao = new Adocao(adotante, animal);

        if (abrigo.removerAnimal(animal)) {
            System.out.println("\nAnimal adotado com sucesso!!");
            System.out.println("\nAdotante: " + adotante);
            System.out.println("Animal adotado: " + animal.getTipo() + " - " + animal + "\n");
        } else {
            System.out.println("\nErro ao adotar o animal.\n");
        }
    }
}