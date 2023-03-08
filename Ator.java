import java.util.ArrayList;
import java.util.Collection;

public class Ator extends Pessoa {

    private String registro;

    private Collection<Filme> filmes = new ArrayList<>();

    public String getRegistro() {
        return registro;
    }

    public Ator(String nome) {
        super.setNome(nome);
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Collection<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Collection<Filme> filmes) {
        this.filmes = filmes;
    }

    public void addFilme(Filme filme) {
        this.filmes.add(filme);
    }
}
