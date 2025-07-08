package NivelIntermediario.Desafio4;

import NivelIntermediario.Uzumaki;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto",13,"Rasengan",TipoHabilidade.NINJUTSU);
        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke",23,"Katom","Rinnegan",TipoHabilidade.RINNEGAN);

        Sasuke.mostrarInformacoes();
        Sasuke.executarEspecialidade();
        Sasuke.executarHabilidade();
        Sasuke.tipoDaHabilidade();

        System.out.println("..");
        System.out.println("..");

        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
        Naruto.tipoDaHabilidade();

    }
}
