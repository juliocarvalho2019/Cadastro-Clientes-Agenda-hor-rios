package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Otavio
 */
public class Conexao {

    public static Connection getConexao() {
        try {
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud", "postgres", "postgres");
            System.out.println("conectado com sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
        }
        return null;
    }
    
//    //testar conexão com banco
//    public static void main(String[] args) {
//        Conexao.getConexao();
//    }
}
