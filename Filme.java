public class Filme {

    private String nome;
    private Integer anoLancamento;
    private Integer nota;

    private Genero genero;

    private Diretor diretor;

    public Filme(Genero genero, Diretor diretor) {
        this.genero = genero;
        this.diretor = diretor;
        diretor.addFilme(this);
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
}
