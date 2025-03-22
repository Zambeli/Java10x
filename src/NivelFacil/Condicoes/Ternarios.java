package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

      /*
        Ternários são maneiras de reduzir o código
        variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        */

        short numeroDeMissoes = 11;

        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos que 10 missões";
        System.out.println(nivelDoNinja);


    }
}
