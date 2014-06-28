/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sablecc.portugol.lexer.LexerException;
import org.sablecc.portugol.node.EOF;
import org.sablecc.portugol.node.Start;
import org.sablecc.portugol.node.TBranco;
import org.sablecc.portugol.node.Token;
import org.sablecc.portugol.parser.Parser;
import org.sablecc.portugol.parser.ParserException;

/**
 * @author Vinícius e Lucas
 */
public class TesteSintatico {

    public void iniciar() throws FileNotFoundException, IOException, LexerException, ParserException {
        //carrega o arquivo
        File f = new File("D:\\Users\\Eduardo Santos\\Documents\\NetBeansProjects\\Compilador\\src\\compilador\\teste.txt");
        Reader arq_teste;
        try {
            arq_teste = new FileReader(f);
            MyLexer lexer = new MyLexer(new PushbackReader(arq_teste));
            Parser parser = new Parser(lexer);
            Start tree = parser.parse();
            do {
                Token token = lexer.next();
                String nome = token.getClass().getSimpleName();
                if (!nome.equals("EOF")) {
                    nome = nome.substring(1, nome.length());
                }
                if (token instanceof TBranco) {
                    //System.out.print(token.getText());
                } else {
                    System.out.print(nome + "\n");
                }
                //caso seja o final do arquivo ele para
                if (token instanceof EOF) {
                    break;
                }
            } while (true);
        } catch (LexerException ex) {
            System.out.println("Erro de sintaxe");
         } catch (ParserException ex) {
            Logger.getLogger(TesteSintatico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}