package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public void tipoDaHabilidade() {
        System.out.println("O tipo da minha habilidade é: " + tipoHabilidade);
    }

    public void executarHabilidade() {
        System.out.println("Estou usando minha Habilidade: " + habilidade );
    };

    public void executarEspecialidade() {
        System.out.println("Estou usando minha habilidade especial: " + especialidade );
    }

    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    };

}
