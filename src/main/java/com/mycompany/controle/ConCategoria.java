/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.dao.DaoCategoria;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModCategoria;
import com.mycompany.visao.categoria.ListCategoria;
import javax.swing.JOptionPane;

/**
 *
 * @author 10156
 */
public class ConCategoria {
    public Boolean existeDadosTemporarios(){        
        return DadosTemporarios.tempObject instanceof ModCategoria;
    }
    
    public void inserir(int id, String nome, String descricao){
        DaoCategoria daoCategoria = new DaoCategoria();
        
        if (daoCategoria.inserir(id, nome, descricao))
            JOptionPane.showMessageDialog(null, "Categoria salva com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível salvar a categoria!");
    }
    
    public void alterar(int id, String nome, String descricao){
        DaoCategoria daoCategoria = new DaoCategoria();
        
        if (daoCategoria.alterar(id, nome, descricao))
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível alterar a categoria!");
    }
    
    public void excluir(int id){
        DaoCategoria daoCategoria = new DaoCategoria();
        
        if (daoCategoria.excluir(id))
            JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível excluir a categoria!");
    }
}
