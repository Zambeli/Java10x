package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

      /*
        SwitchCases: Servem para gerar casos específicos.
        Objetivo: Pedir para o usuário escolher entre os Ninjas.
       */

        //Pedir para o usuário
        Scanner scanner = new Scanner(System.in);


        //Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuário escolher uma opção

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        //Reação ao escolher o personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida, tente novamente");
                break;
}
        //Fechar a caixa
        scanner.close();

    }
}
