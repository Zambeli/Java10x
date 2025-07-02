package NivelIntermediario;

public class Main {

    public static void main(String[] args) {

        //Criar o ninja Naruto - Naruto é um objeto.

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado();

        //Criar o ninja Sasuke - Sasuke é um objeto.

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 16;
        Sasuke.SharinganAtivado();

        //Aplicando métodos aos meus objetos

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem " + Sasuke.idade + " anos, então falta no mínimo " + quantoTempoFalta + " anos para você se tornar hokage");

        //Criar o ninja Sakura - Sakura é um objeto.

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 16;
        Sakura.AtivarCura();

        //Criar o ninja Hinata - Sakura é um objeto.

        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 15;
        Hinata.ByakuganAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki Hyuuga";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

    }

}
