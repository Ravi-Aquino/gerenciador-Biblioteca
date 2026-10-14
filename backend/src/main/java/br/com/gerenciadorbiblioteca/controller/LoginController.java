package br.com.gerenciadorbiblioteca.controller;

import br.com.gerenciadorbiblioteca.service.AuthService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usuarioField;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Button entrarBtn;
    @FXML
    private Label lblErro;

    @FXML
    private void fazerLogin() {
        String usuario = usuarioField.getText();
        String senha = senhaField.getText();

        lblErro.setVisible(false);

        if (usuario.isBlank() || senha.isBlank()) {
            lblErro.setText("Preencha todos os campos.");
            lblErro.setVisible(true);
            return;
        }

        if(AuthService.login(usuario, senha)){
            abrirTelaPrincipal();
        }else{
            lblErro.setText("Usuário ou senha incorretos!");
            lblErro.setVisible(true);
        }
        AuthService.login(usuario, senha);
        abrirTelaPrincipal();
    }

    private void abrirTelaPrincipal() {
        try {
            Parent tela = FXMLLoader.load(
                    getClass().getResource("/fxml/principal.fxml")
            );

            System.out.println("Tela carregada: " + (tela != null));
            System.out.println("Botão: " + entrarBtn);
            System.out.println("Cena: " + entrarBtn.getScene());

            Scene cenaAtual = entrarBtn.getScene();
            Stage stage = (Stage) cenaAtual.getWindow();

            stage.setScene(new Scene(tela));
            stage.setTitle("Gerenciador de Biblioteca");
            stage.centerOnScreen();

        } catch (IOException e) {
            lblErro.setText("Não foi possível abrir a tela principal.");
            lblErro.setVisible(true);
            e.printStackTrace();
        }
    }
}
