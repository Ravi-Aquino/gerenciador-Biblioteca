package model;

public class Usuario {
    private long id;
    private String nome;
    private String cpf;
    private StatusUsuario status;
    //-------------------------------------------------------------------------------------

    public Usuario(String nome, String cpf, StatusUsuario status) {
        this.nome = nome;
        this.cpf = cpf;
        this.status = status;
    }

    //-------------------------------------------------------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }


    //-------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", status=" + status +
                '}';
    }

    //-------------------------------------------------------------------------------------
}
