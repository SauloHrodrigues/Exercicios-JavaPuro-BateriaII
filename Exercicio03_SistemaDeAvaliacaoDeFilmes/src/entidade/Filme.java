package entidade;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private String genero;
    private List<Avaliacao> avaliacoes;
    private double mediaDasAvaliacoes;

    public Filme(String titulo, String genero, Avaliacao avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacoes = new ArrayList<>();
        adicionarAvaliacoes(avaliacao.getNomeDoUsuario(),avaliacao.getNota(),avaliacao.getComentario());
    }
    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacoes(String nome, int nota, String comentario){
        Avaliacao avaliacao = new Avaliacao(nome,nota,comentario,this);
        this.avaliacoes.add(avaliacao);
    }

    public double getMediaDasAvaliacoes() {
        return   avaliacoes.stream()
                .mapToDouble(Avaliacao::getNota)
                .average()
                .orElse(0.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", avaliacoes=" + avaliacoes +
                ", mediaDasAvaliacoes=" + mediaDasAvaliacoes +
                '}';
    }
}