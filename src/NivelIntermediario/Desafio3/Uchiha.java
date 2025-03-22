package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja {
    private String habilidadeEspecial = "Ativar o Sharingan";

    public void mostrarHabilidadeEspecial() {
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    };

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        mostrarHabilidadeEspecial();
    };
}
