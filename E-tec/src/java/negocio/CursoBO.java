/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.CursoDAO;
import domainModel.Curso;
import domainModel.Curso;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class CursoBO {
    private CursoDAO cursoDAO = new CursoDAO();
    
    public void adicionar(Curso curso){
        
        if (curso.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        cursoDAO.adicionar(curso);
    }
    public void alterar(Curso curso) {

        //Nem um campo pode ficar vazio
       if (curso.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        cursoDAO.alterar(curso);
    }

    public void excluir(Curso curso) {
        cursoDAO.excluir(curso);
    }

    public List<Curso> obterTodos() {
        return cursoDAO.obterTodos();
    }
}