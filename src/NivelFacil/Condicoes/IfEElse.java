package NivelFacil.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
            Objetivo: Passar o ninja de nivel de acordo com o número de missões.
            IF e Else - Condições.
            else if

        */

        //Ninja Naruto
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String rank;

     /*   if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Naruto está pronto para passar de nível.");
        } else {
            System.out.println("Naruto não está pronto para passar de nível.");
        };*/

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        }  else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        };
        

    }
}
