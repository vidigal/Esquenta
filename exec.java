public class exec {

    public static void main(String[] args) {
        Genero ficcaoCientifica = new Genero("Ficção Científica");

        Diretor diretorAvatar = new Diretor("James Cameron");
        Diretor diretorMatrix = new Diretor("Irmãs ...");

        Filme matrix = new Filme(ficcaoCientifica, diretorMatrix);
        Filme avatar = new Filme(ficcaoCientifica, diretorAvatar);
        Filme f1 = new Filme(ficcaoCientifica, diretorAvatar);
        Filme f2 = new Filme(ficcaoCientifica, diretorAvatar);
        Filme f3 = new Filme(ficcaoCientifica, diretorAvatar);
        Filme f4 = new Filme(ficcaoCientifica, diretorAvatar);
        Filme f5 = new Filme(ficcaoCientifica, diretorAvatar);

       matrix.setNome("Matrix");
       avatar.setNome("Avatar");
       avatar.setAnoLancamento(2009);
        avatar.setNota(8);
        //System.out.println(f1);

        diretorAvatar.listaFilmes();

    }

}
