import java.util.ArrayList;
import java.util.Collection;

public class Diretor extends Pessoa {

    private Integer quantidadePremios;

    private Collection<Filme> filmes = new ArrayList<Filme>();

    public Diretor(String nome) {
        super.setNome(nome);
    }

    public Integer getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(Integer quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
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

    public void listaFilmes() {
        for (Filme filme: this.filmes) {
            System.out.println(filme.getNome());
        }
    }

    @Override
    public String toString() {
        return super.getNome() + " - Prêmios: " + this.getQuantidadePremios();
    }
}
