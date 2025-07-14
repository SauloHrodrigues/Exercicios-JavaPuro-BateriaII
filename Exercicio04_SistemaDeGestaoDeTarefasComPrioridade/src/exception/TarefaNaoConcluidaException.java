package exception;

public class TarefaNaoConcluidaException extends RuntimeException{
    public TarefaNaoConcluidaException(String mensagem){
        super(mensagem);
    }
}
