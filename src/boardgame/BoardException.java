package boardgame;

//Exceção opcional de ser tratada.
public class BoardException extends RuntimeException {

    //Construtor que recebe a mensagem.
    public BoardException(String msg) {
        super(msg);
    }
}
