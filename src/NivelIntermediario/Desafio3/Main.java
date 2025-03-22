package NivelIntermediario.Desafio3;

import NivelFacil.Arrays.Array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Uchiha[] ninjas = new Uchiha[5];

        int contadorNinjas = 0;
        int numeroEscolhido;

        Scanner escolha = new Scanner(System.in);

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke";
        Sasuke.idade = 16;
        Sasuke.missao = "Caçar o Orochimaru";
        Sasuke.nivelDificuldade = "S";
        Sasuke.statusMissao = "Em andamento";

        ninjas[0] = Sasuke;
        contadorNinjas = 1;

        do {

            System.out.println("\n---------------------");
            System.out.println("1: Exibir todos os ninjas");
            System.out.println("2: Criar novo Ninja");
            System.out.println("3: Atualizar Habilidade Especial");
            System.out.println("4: Sair");

            System.out.println("\n---------------------");
            System.out.println("Digite a opção que deseja escolher");
            numeroEscolhido = escolha.nextInt();
            escolha.nextLine();

            switch (numeroEscolhido) {
                case 1:
                    System.out.println("\n--- Ninja Cadastrados ---");
                    if(contadorNinjas == 0) {
                        System.out.println("Nenhum ninja cadastrados.");
                    } else {
                        for (int i = 0; i < contadorNinjas ; i++) {
                            System.out.println("\nNinja #" + (i+1));
                            ninjas[i].mostrarInformacoes();
                        }
                    }
                    break;
                case 2:
                    if (contadorNinjas >= ninjas.length) {
                        System.out.println("Limite de ninjas atingido, Não é possivel adicionar mais.");
                    } else {
                        System.out.println("\n--- Cadastro de Novo Ninja ---");
                        Uchiha novoNinja = new Uchiha();

                        System.out.println("Digite o nome do Ninja");
                        novoNinja.nome = escolha.nextLine();

                        System.out.println("Digite a idade do Ninja");
                        novoNinja.idade = escolha.nextInt();

                        System.out.println("Digite a missão do Ninja");
                        novoNinja.missao = escolha.nextLine();
                        novoNinja.missao = escolha.nextLine();

                        System.out.println("Digite a dificuldade da missão entre (D, C, B, A, S):");
                        novoNinja.nivelDificuldade = escolha.nextLine();

                        System.out.println("Digite o status da missão:");
                        novoNinja.statusMissao = escolha.nextLine();

                        ninjas[contadorNinjas] = novoNinja;
                        contadorNinjas++;

                        System.out.println("Ninja " + novoNinja.nome + " cadastrado com sucesso!");
                    }
                    break;
                case 3:
                    if(contadorNinjas == 0) {
                        System.out.println("Não há ninjas para cadastrar.");
                    } else {

                        System.out.println("\n--- Atualizar Habilidade Especial ---");
                        System.out.println("Escolha o ninja pela posição (1 a " +contadorNinjas + "):");

                        for (int i = 0; i < contadorNinjas; i++) {
                            System.out.println((i + 1) + ": " + ninjas[i].nome);
                        }

                        int posicao = escolha.nextInt();
                        escolha.nextLine();

                        if(posicao < 1 || posicao > contadorNinjas) {
                            System.out.println("Posicão inválida!");
                        } else {
                            System.out.println("Digite a nova habilidade especial para " + ninjas[posicao - 1].nome + ":");
                            String novaHabilidade = escolha.nextLine();
                            ninjas[posicao - 1].habilidadeEspecial = novaHabilidade;
                        }

                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opcão inválida, tente novamente.");
            }

        } while (numeroEscolhido != 4);

        escolha.close();

    }

}
