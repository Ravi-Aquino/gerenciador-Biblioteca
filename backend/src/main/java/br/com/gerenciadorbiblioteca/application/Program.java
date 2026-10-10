package br.com.gerenciadorbiblioteca.application;

import br.com.gerenciadorbiblioteca.config.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        try(Connection connection = ConnectionFactory.getConnection()){
            System.out.println("Conexão feita com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao se conectar com o banco!");
            e.printStackTrace();
        }
    }
}
