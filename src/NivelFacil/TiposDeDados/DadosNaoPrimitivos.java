package NivelFacil.TiposDeDados;

public class DadosNaoPrimitivos {

    public static void main(String[] args) {
/*
        Tudo que for digitado aqui dentro com o comandp PSVM vai ser compilado pelo Java
        Dados não primitivos: String, Array, Class, enum
        Objetivo: Criar um ninja e atribuir métodos a ele.
*/

        String nome = "Naruto Uzumaki";
        nome.toUpperCase(); //ToUppercase vai colocar tudo em CAPSLOCK
        String nomeUpperCase = nome.toUpperCase();
        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto está em Normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // Ao inverso do ToUppercase ele vai deixar tudo em texto de caixa baixa

        System.out.println(aldeiaEmCaixaBaixa);

    }

}
