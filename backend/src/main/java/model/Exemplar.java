package model;

public class Exemplar {
    private long id;
    private Livro livro;
    private StatusExemplar status;

    //------------------------------------------------------------


    public Exemplar(long id, Livro livro, StatusExemplar status) {
        this.id = id;
        this.livro = livro;
        this.status = status;
    }
    //------------------------------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public void setStatus(StatusExemplar status) {
        this.status = status;
    }
    //------------------------------------------------------------

    @Override
    public String toString() {
        return "Exemplar{" +
                "id=" + id +
                ", livro=" + livro +
                ", status=" + status +
                '}';
    }
}
