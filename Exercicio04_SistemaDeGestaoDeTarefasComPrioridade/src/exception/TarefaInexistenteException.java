package exception;

public class TarefaInexistenteException extends RuntimeException{
    public TarefaInexistenteException(String mensagem){
        super(mensagem);
    }
}
