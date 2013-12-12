package negocio;

import dataAcess.TurmaDAO;
import domainModel.Turma;
import domainModel.Turma;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class TurmaBO {

    private TurmaDAO turmaDao = new TurmaDAO();

    public void adicionar(Turma turma) {
        if (turma.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }

        //Se tudo der certo, passa para a camada de persistencia
        turmaDao.adicionar(turma);

    }

    public void alterar(Turma turma) {

        //Nem um campo pode ficar vazio
        if (turma.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }

        turmaDao.alterar(turma);
    }

    public void excluir(Turma turma) {
        turmaDao.excluir(turma);
    }

    public List<Turma> obterTodos() {
        return turmaDao.obterTodos();
    }
}
