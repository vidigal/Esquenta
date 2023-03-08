public class exec2 {

    public static void main(String[] args) {
        Ator ator1 = new Ator("José");
        Ator ator2 = new Ator("Maria");
        Ator ator3 = new Ator("João");

        Genero genero1 = new Genero("Ficção Científica");
        Genero genero2 = new Genero("Terror");

        Diretor diretor1 = new Diretor("James");
        Diretor diretor2 = new Diretor("Diana");
        diretor2.setQuantidadePremios(14);


        Filme filme1 = new Filme(genero1, diretor2, ator1);
        filme1.setNome("Matrix");
        filme1.addAtor(ator2);
        filme1.addAtor(ator3);

        filme1.imprimirInformacoes();

    }

}
