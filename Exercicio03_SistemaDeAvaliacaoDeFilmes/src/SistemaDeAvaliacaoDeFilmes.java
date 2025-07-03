import entidade.Avaliacao;
import entidade.Filme;

public class SistemaDeAvaliacaoDeFilmes {
    public static void main(String[] args) {

        Filme reiLaao = new Filme("Rei Leão","animação");

        reiLaao.adicionarAvaliacoes("josé",10,"o filme é muito bom!");
        reiLaao.adicionarAvaliacoes("maria",0,"o filme é muito bom!");

        System.out.println("A media foi: "+reiLaao.getMediaDasAvaliacoes());

        for(Avaliacao a : reiLaao.getAvaliacoes()){
            System.out.println(a);
        }
    }
}
