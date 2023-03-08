import java.util.ArrayList;
import java.util.Collection;

public class Filme {

    private String nome;
    private Integer anoLancamento;
    private Integer nota;

    private Genero genero;
    private Diretor diretor;
    private Collection<Ator> atores = new ArrayList<>();

    public Filme(Genero genero, Diretor diretor, Ator ator) {
        this.genero = genero;
        this.diretor = diretor;
        diretor.addFilme(this);
        this.addAtor(ator);
        ator.addFilme(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.nome.concat("\n").concat(this.getGenero().getNome()).concat("\n").concat(this.getAnoLancamento().toString());
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Collection<Ator> getAtores() {
        return atores;
    }

    public void setAtores(Collection<Ator> atores) {
        this.atores = atores;
    }

    public void addAtor(Ator ator) {
        this.atores.add(ator);
    }

    public void imprimirInformacoes() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Gênero: " + this.genero.getNome());
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Atores:");
        for (Ator a: this.atores) {
            System.out.println("- " + a.getNome());
        }

    }
}
