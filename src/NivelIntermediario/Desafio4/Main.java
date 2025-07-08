package NivelIntermediario.Desafio4;

import NivelIntermediario.Uzumaki;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto",13,"Rasengam");
        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke",23,"Katom","Rinnegam");

        Sasuke.executarEspecialidade();
        Sasuke.executarHabilidade();
        Sasuke.mostrarInformacoes();

        Naruto.executarHabilidade();
        Naruto.mostrarInformacoes();

    }
}
