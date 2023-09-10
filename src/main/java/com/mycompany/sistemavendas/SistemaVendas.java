/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavendas;

import com.my.company.ferramentas.ConexaoBancoDeDadosMySql;
import java.sql.Connection;

/**
 *
 * @author jose_
 */
public class SistemaVendas {

    public static void main(String[] args) {
        Connection connection = ConexaoBancoDeDadosMySql.obterConexao();
        
        if (connection != null){
            System.out.println("Conexão com o banco de dados estabelecida.");
        }
    }
}
