import java.util.ArrayList;
import java.util.Collection;

public class exec {

    public static void main(String[] args) {
        Genero ficcaoCientifica = new Genero("Ficção Científica");

        Diretor diretorAvatar = new Diretor("James Cameron");
        Diretor diretorMatrix = new Diretor("Irmãs ...");

        Ator bradPitt = new Ator("Brad Pitt");

        Filme matrix = new Filme(ficcaoCientifica, diretorMatrix, bradPitt);
        Filme avatar = new Filme(ficcaoCientifica, diretorAvatar, bradPitt);
        Filme f1 = new Filme(ficcaoCientifica, diretorAvatar, bradPitt);
        Filme f2 = new Filme(ficcaoCientifica, diretorAvatar, bradPitt);
        Filme f3 = new Filme(ficcaoCientifica, diretorAvatar, bradPitt);
        Filme f4 = new Filme(ficcaoCientifica, diretorAvatar, bradPitt);
        Filme f5 = new Filme(ficcaoCientifica, diretorAvatar, bradPitt);

       matrix.setNome("Matrix");
       avatar.setNome("Avatar");
       avatar.setAnoLancamento(2009);
        avatar.setNota(8);
        //System.out.println(f1);

        diretorAvatar.listaFilmes();

    }

}
