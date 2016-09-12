/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.alphadev.dao;

import java.sql.*;


/**
 *
 * @author fernando
 */
public class ModuloConexao {
  
  public static Connection conector() {
    Connection conexao = null;

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_fatec";
    String userName = "fatec";
    String password = "fatec";
    
    try {

      Class.forName(driver);
      conexao = DriverManager.getConnection(url,userName,password);
      return conexao;

    } catch (ClassNotFoundException | SQLException e) {

      System.out.println("Erro: " + e);
      return null;
    }
  }
  
  
}
