package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public void executarHabilidade() {
        System.out.println("Estou usando minha Habilidade: " + habilidade );
    };

    public void executarEspecialidade() {
        System.out.println("Estou usando minha abilidade especial: " + especialidade );
    }

    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    };

}
