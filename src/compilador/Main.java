/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.sablecc.portugol.lexer.LexerException;
import org.sablecc.portugol.parser.ParserException;

/**
 *
 * @author Vinicius e Lucas
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, LexerException, ParserException {
        TesteSintatico teste = new TesteSintatico();
        teste.iniciar();
    }
}
