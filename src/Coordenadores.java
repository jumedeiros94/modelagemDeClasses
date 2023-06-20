import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Professores {

    private final List<Professores> professoresSupervisionados;

    public Coordenadores(String cpf, String nome, int numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplinaMninistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(cpf, nome, numeroDeRegistro, orgaoDeLotacao, salario, nivelGraduacao, disciplinaMninistrada, quantidadeDeAlunos, quantidadeDeTurmas);

        professoresSupervisionados = new ArrayList<>();
    }


    @Override
    public void aumentoSalario(){
        setSalario(getSalario() * 1.05);
    }

    public void adicionaProfessor(Professores professores){
        professoresSupervisionados.add(professores);
    }
}
