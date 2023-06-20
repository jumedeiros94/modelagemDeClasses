public class Funcionarios {
    private String cpf;
    private String nome;
    private int numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    public Funcionarios(String cpf, String nome, int numeroDeRegistro, String orgaoDeLotacao, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    public void aumentoSalario(){
        this.salario *= 1.1;
    }

}
