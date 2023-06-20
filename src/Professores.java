public class Professores extends Funcionarios{
    private String nivelGraduacao;
    private String disciplinaMninistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;

    public Professores(String cpf, String nome, int numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplinaMninistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(cpf, nome, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMninistrada = disciplinaMninistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }


    public void adicionaTurma() {
        this.quantidadeDeTurmas++;
    }


}
