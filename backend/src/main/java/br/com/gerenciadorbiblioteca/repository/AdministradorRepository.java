package br.com.gerenciadorbiblioteca.repository;

import br.com.gerenciadorbiblioteca.config.ConnectionFactory;
import br.com.gerenciadorbiblioteca.model.Administrador;
import br.com.gerenciadorbiblioteca.model.Usuario;

import java.sql.*;
import java.util.Optional;

public class AdministradorRepository {
    public Optional<Administrador> buscarPorEmail(String email) {
        String sql = "SELECT nome, email, senha FROM administradores WHERE email = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Administrador admin = new Administrador();
                    admin.setNome(rs.getString("nome"));
                    admin.setEmail(rs.getString("email"));
                    admin.setSenha(rs.getString("senha"));

                    return Optional.of(admin);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar administrador.", e);
        }

        return Optional.empty();
    }
    public Administrador getAdministrador(String email, String senha) {
        String sql = "SELECT * FROM administradores WHERE email = ? AND password = ?";

        Administrador admin = new Administrador();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                admin.setNome(rs.getString("nome"));
                admin.setEmail(rs.getString("email"));
                admin.setSenha(rs.getString("senha"));

                System.out.println(rs.getString("nome") + " | " + rs.getString("email") + " | " + rs.getString("senha"));

            }
            return admin;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }


}
