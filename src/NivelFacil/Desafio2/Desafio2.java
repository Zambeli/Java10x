package NivelFacil.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[10];
        int indice = 0;

        int opcao;

        do {
            System.out.println("\nBem-vindo ao Criador de Ninjas da Fila da Folha");
            System.out.println("1: Listar Ninjas");
            System.out.println("2: Registrar Ninja");
            System.out.println("3: Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seus ninjas atuais são" );

                    if(indice == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        for(int i = 0; i < indice; i++) {
                            System.out.println("- " + ninjas[i] );
                        };
                    }
                    break;
                case 2:
                    if(indice < ninjas.length){
                        System.out.println("Digite o nome do seu ninja: ");
                        scanner.nextLine();
                        String ninja = scanner.nextLine();
                        ninjas[indice] = ninja;
                        indice++;
                        System.out.println("Ninja registrado com sucesso! ");
                    } else {
                        System.out.println("Fila de ninjas está cheia ");
                    }
                    break;
                case 3:
                    System.out.println("Até mais");
                    break;
                default:
                    System.out.println("Numero Inválido. ");
                    break;
            }
        } while (opcao != 3);

        scanner.close();

    }
}
