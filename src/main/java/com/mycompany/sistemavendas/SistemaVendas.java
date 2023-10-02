/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavendas;

import com.my.company.ferramentas.BancoDeDadosMySql;
import com.mycompany.dao.DaoCategoria;
import java.sql.Connection;

/**
 *
 * @author jose_
 */
public class SistemaVendas {

    public static void main(String[] args) {
        BancoDeDadosMySql.conectar();
        
//        //Teste listagem
//        DaoCategoria categoria = new DaoCategoria();
//        
//        for(int i = 0; i < categoria.listar().size(); i++){
//            System.out.println(categoria.listar().get(i).getId());
//            System.out.println(categoria.listar().get(i).getNome());
//        }
    }
}
