package NivelFacil.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
            Laços de repetição: vao repetir infinitamente até atingir o parametro desejado.

            WHILE = FOR

            while (condicao) { //Enquanto a condição for verdadeira
	           // Tudo aqui é executado
            }




        */

        int numeroDeClones = 0;
        int maximoDeClones = 40;

        /*while (numeroDeClones <= maximoDeClones) {
            System.out.println("O naruto fez " + numeroDeClones + " clones");
            numeroDeClones++;
        };*/

    /*    for(int i = 0; i <= maximoDeClones; i++) {
            System.out.println("O naruto fez " + i + " clones");
        };*/

        // Usando o laço for para treinar Jutsus 5 vezes
        for (int i = 1; i <= 5; i++) { System.out.println("Treinamento de Jutsu número: " + i); } // Usando o laço do-while para simular o treinamento de controle de chakra
        int chakra = 100;
        while (chakra > 0) {
            System.out.println("Controlando o chakra, energia restante: " + chakra);
            chakra -= 10;
        }

        System.out.println("Treinamento concluído. O chakra foi completamente utilizado.");


    }
}
