package model;

public class Administrador {
    private long id;
    private String nome;
    private String email;
    private String senha;
    private StatusAdmin status;

    //---------------------------------------------------------------------

    public Administrador(String nome, String email, String senha, StatusAdmin status) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    //---------------------------------------------------------------------

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StatusAdmin getStatus() {
        return status;
    }

    public void setStatus(StatusAdmin status) {
        this.status = status;
    }

    //---------------------------------------------------------------------

    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", status=" + status +
                '}';
    }

    //---------------------------------------------------------------------

}
