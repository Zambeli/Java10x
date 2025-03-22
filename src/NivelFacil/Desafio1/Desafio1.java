package NivelFacil.Desafio1;

public class Desafio1 {
    public static void main(String[] args) {

        //Ninja 1

        String nome1 = "Naruto";
        int idade1 = 16;
        String nomeMissao1 = "Caçar dinheiro";
        String nivelMissao1 = "C";
        String statusMissao1 = "Concluida";

        System.out.println(nome1);
        System.out.println(idade1);
        System.out.println(nomeMissao1);
        System.out.println(nivelMissao1);
        System.out.println(statusMissao1);

        if(idade1 < 15) {
            if(nivelMissao1 == "C" || nivelMissao1 == "D") {
                statusMissao1 = "Não concluida";
                System.out.println(statusMissao1);
            } else {
                statusMissao1 = "Concluida";
                System.out.println(statusMissao1);
            };
        } else {
            statusMissao1 = "Concluida";
        }

       /* if(idade1 < 15 && statusMissao1 == false) {
            System.out.println("Só pode receber missão nivel C ou D");
            statusMissao1 = true;
            System.out.println(statusMissao1);
        } else if (idade1 >= 15 && statusMissao1 == false) {
            System.out.println("Só pode receber missão de qualquer nivel");
            statusMissao1 = true;
            System.out.println(statusMissao1);
        }*/

        //Ninja 2

        String nome2 = "Sasuke";
        int idade2 = 17;
        String nomeMissao2 = "Caçar naruto";
        String nivelMissao2 = "A";
        boolean statusMissao2 = true;

        //Ninja 3

        String nome3 = "Jiraya";
        int idade3 = 36;
        String nomeMissao3 = "Caçar mulher";
        String nivelMissao3 = "S";
        boolean statusMissao3 = true;


    }

}
