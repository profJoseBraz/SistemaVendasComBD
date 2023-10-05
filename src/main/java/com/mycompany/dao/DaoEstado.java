/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import static com.my.company.ferramentas.BancoDeDadosMySql.getConexao;
import static com.my.company.ferramentas.BancoDeDadosMySql.getResultado;
import static com.my.company.ferramentas.BancoDeDadosMySql.getStatement;
import static com.my.company.ferramentas.BancoDeDadosMySql.setResultado;
import static com.my.company.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author 10156
 */
public class DaoEstado {
    
    String sql;
    
    public ResultSet listarTodos(){
        try{
            sql = 
                "SELECT ID, ID_PAIS, NOME, UF FROM ESTADO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                "SELECT ID, ID_PAIS, NOME, UF FROM ESTADO WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
}
