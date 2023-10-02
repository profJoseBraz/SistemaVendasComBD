/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.my.company.ferramentas.BancoDeDadosMySql;
import com.mycompany.modelo.ModCategoria;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jose_
 */
public class DaoCategoria extends BancoDeDadosMySql{
    
    private String sql; 
    
    public ResultSet listar(){
        
        try{
            sql = "SELECT * FROM CATEGORIA";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
}
