package exceptions;

public class ReservaInexistenteException extends RuntimeException{

    public ReservaInexistenteException(String mensagem){
        super(mensagem);
    }
}
