public class FuncionariosAdministrativos  extends Funcionarios{
    private String funcaoAdministrativa;
    private String senioridade;


    public FuncionariosAdministrativos(String cpf, String nome, int numeroDeRegistro, String orgaoDeLotacao,
                                       double salario, String funcaoAdministrativa, String senioridade) {
        super(cpf, nome, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }
}
