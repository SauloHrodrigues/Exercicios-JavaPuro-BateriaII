package exception;

public class TarefaConcluidaException extends RuntimeException{
    public TarefaConcluidaException(String mensagem){
        super(mensagem);
    }
}
