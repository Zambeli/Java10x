package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public void tipoDaHabilidade() {
        System.out.println("O tipo da minha habilidade é: " + tipoHabilidade);
    }

    public void executarHabilidade() {
        System.out.println("Estou usando minha Habilidade: " + habilidade );
    };


    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    };

}
