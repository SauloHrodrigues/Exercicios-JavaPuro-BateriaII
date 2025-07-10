package entidade;

public class Avaliacao {
    private String nomeDoUsuario;
    private int nota;
    private String comentario;
    private Filme filmeAvaliado;

    public Avaliacao(String nomeDoUsuario, int nota, String comentario,Filme filme) {
        this.nomeDoUsuario = nomeDoUsuario;
        validarNota(nota);
        this.comentario = comentario;
        this.filmeAvaliado = filme;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void validarNota(int nota) {
        if(nota <0){
            this.nota=0;
        } else if (nota > 10) {
            this.nota = 10;
        } else {
            this.nota = nota;
        }
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "nomeDoUsuario='" + nomeDoUsuario + '\'' +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                ", filmeAvaliado=" + filmeAvaliado.getTitulo() +
                '}';
    }
}