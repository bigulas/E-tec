package negocio;

import dataAcess.TurmaDAO;
import domainModel.Turma;

/**
 *
 * @author arnaldo
 */
public class TurmaBO {
    private TurmaDAO turmaDAO = new TurmaDAO();
    
    public void adicionar(Turma turma){
        if(turma.getNome().trim().length() <=0){
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        
        //Se tudo der certo, passa para a camada de persistencia
        turmaDAO.adicionar(turma);
    }
    
}
