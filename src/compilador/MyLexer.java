package compilador;

import org.sablecc.portugol.lexer.*;
import org.sablecc.portugol.node.*;

public class MyLexer extends Lexer {

    private int count;
    private TComentarioBloco comment;
    private StringBuffer text;
    // We define a constructor

    public MyLexer(java.io.PushbackReader in) {
        super(in);
    }
    // We define a filter that recognizes nested comments.

    protected void filter() throws LexerException { // if we are in the comment state
        if (state.equals(State.COMENTARIO)) { // if we are just entering this state
            if (comment == null) { // The token is supposed to be a comment.
                // We keep a reference to it and set the count to one
                comment = (TComentarioBloco) token;
                text = new StringBuffer(comment.getText());
                count = 1;
                token = null; // continue to scan the input.
            } else { // we were already in the comment state
                text.append(token.getText()); // accumulate the text.
                if (token instanceof TComentarioBloco) {
                    count++;
                } else if (token instanceof TComentarioFinal) {
                    count--;
                }
                if (token instanceof EOF) {
                    throw new LexerException(null, "token coment�rio desbalanceado");
                }
                if (count != 0) {
                    token = null; // continue to scan the input.
                } else {
                    comment.setText(text.toString());
                    token = comment; //return a comment with the full text.
                    state = State.NORMAL; //go back to normal.
                    comment = null; // We release this reference.
                }
            }
        }
    }
}