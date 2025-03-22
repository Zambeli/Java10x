package NivelFacil.Arrays;

public class Array {

//    public static void main(String[] args) {
//
//
//        //NivelFacil.Arrays são tipo referencias!
//        String[] ninja = new String[6];
//
//
//        ninja[0] = "Naruto Uzumaki";
//        ninja[1] = "Sasuke Uchiha";
//        ninja[2] = "Sakura Haruno";
//        ninja[3] = "Hinata Hyuuga";
//
//        //Redeclarar o ARRAY
//
//        ninja = new String[7];
//        ninja[0] = "Hashirama Senju";
//        ninja[1] = "Tobirama Senju";
//        ninja[2] = "Hiruzen Sarutobi";
//        ninja[3] = "Minato Namikaze";
//        ninja[4] = "Tsunade Senju";
//        ninja[5] = "Kakashi Hatake";
//        ninja[6] = "Naruto Uzumaki";
//        System.out.println(ninja[2]);
//
//        for(int i = 0; i < ninja.length; i++) {
//            System.out.println(ninja[i]);
//        };
//
//
//       // int[] idade = {1,3,4,5};
//
//        System.out.println(ninja); // Para acessar um ninja específico devemos especificar o index dele
//
//        //Inicialização Direta
//        String[] ninjaa = {"Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno", "Hinata Hyuuga"};
//        //System.out.println(ninjaa[1]);
//
//
//
//        //Redeclarar
//
//        String nomeNinja = "Naruto Uzumaki";
//        nomeNinja = "Boruto Uzumaki";
//
//
//
//
//
//        int[] idade = new int[2];
//
//
//
//
//        System.out.println(idade);
//
//
//        String nomeDoNinja1 = "Gaara do deserto";
//        String nomeDoNinja2 = "Rock lee";
//
//
//
//
//
//    }

    public static void main(String[] args) {


        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki"; // Linha 0 Coluna 1
        ninjasEAldeias[0][2] = "Sasuke Uchiha"; // Linha 0 Coluna 2

        ninjasEAldeias[1][0] = "Nevoa"; // Linha 1 Coluna 0
        ninjasEAldeias[1][1] = "Zabuza"; // Linha 1 Coluna 1
        ninjasEAldeias[1][2] = "Haku"; // Linha 1 Coluna 2

        ninjasEAldeias[2][0] = "Deserto"; // Linha 2 Coluna 0
        ninjasEAldeias[2][1] = "Gaara"; // Linha 2 Coluna 1
        ninjasEAldeias[2][2] = "Temari"; // Linha 2 Coluna 2

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " com os ninjas " + ninjasEAldeias[i][1]+ " e " + ninjasEAldeias[i][2]);
        }

    }

}
