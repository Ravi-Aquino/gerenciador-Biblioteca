package br.com.gerenciadorbiblioteca.service;


import br.com.gerenciadorbiblioteca.model.Administrador;
import br.com.gerenciadorbiblioteca.repository.AdministradorRepository;

import java.util.Optional;

public class AuthService {

    private static AdministradorRepository ar = new AdministradorRepository();

    public static boolean login(String email, String senha){
        Optional<Administrador> resultado = ar.buscarPorEmail(email);

        if(resultado.isEmpty()){
            return false;
        }
        Administrador admin = resultado.get();

        return admin.getSenha().equals(senha);
    }
}
