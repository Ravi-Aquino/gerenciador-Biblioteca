package br.com.gerenciadorbiblioteca.model;

import java.time.LocalDate;

public class Emprestimo {
    private long id;
    private Usuario usuario;
    private Exemplar exemplar;
    private LocalDate dataInicio;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;
    private StatusEmprestimo status;
}
