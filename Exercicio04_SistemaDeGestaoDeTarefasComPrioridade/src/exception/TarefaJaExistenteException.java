package exception;

public class TarefaJaExistenteException extends RuntimeException{
    public TarefaJaExistenteException(String mensagem){
        super(mensagem);
    }
}
