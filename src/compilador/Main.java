/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import org.sablecc.portugol.lexer.*;
import org.sablecc.portugol.node.*;

/**
 *
 * @author Eduardo Santos
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, LexerException, IOException {
        File file = new File("E:\\Users\\Eduardo Santos\\Documents\\NetBeansProjects\\Compilador\\src\\compilador\\teste.txt");
        Lexer lex = new Lexer(new PushbackReader(new FileReader(file)));
        String teste = "";
        int linha = 0;
        while (!(lex.peek() instanceof EOF)) {
            if (lex.peek().getLine() > linha) {
                linha = lex.peek().getLine();
                teste = teste + System.lineSeparator()+linha;
            }
            teste = teste + " " + lex.next().getClass().getSimpleName();
        }
        System.out.println(teste);
    }
}
