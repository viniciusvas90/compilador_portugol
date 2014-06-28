/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.analysis;

import java.util.*;
import org.sablecc.portugol.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclVariavelDeclaracao(ADeclVariavelDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclConstanteDeclaracao(ADeclConstanteDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASequenciaVarVarSeq(ASequenciaVarVarSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicaVarVarSeq(AUnicaVarVarSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoRealTipo(ATipoRealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoIntTipo(ATipoIntTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoCharTipo(ATipoCharTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelSimplesVar(AVariavelSimplesVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelArrayVar(AVariavelArrayVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroValor(AInteiroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSeq(AComandoSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoSeq(ACasoSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoSenao(ACasoSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComSenaoSeDecl(AComSenaoSeDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemSenaoSeDecl(ASemSenaoSeDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComOpExp(AComOpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemOpExp(ASemOpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComOp2Termo(AComOp2Termo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemOp2Termo(ASemOp2Termo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegativoTermo(ANegativoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmparentadoFator(AEmparentadoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstanteFator(AConstanteFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelFator(AVariavelFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaOp(ASomaOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtracaoOp(ASubtracaoOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoOp2(AMultiplicacaoOp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoOp2(ADivisaoOp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASequenciaExpExpSeq(ASequenciaExpExpSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicaExpExpSeq(AUnicaExpExpSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLogica(AExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADisjuncaoExpLogica2(ADisjuncaoExpLogica2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADisjuncaoxExpLogica2(ADisjuncaoxExpLogica2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesExpLogica2(ASimplesExpLogica2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConjuncaoExpLogica3(AConjuncaoExpLogica3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesExpLogica3(ASimplesExpLogica3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesExpLogica4(ASimplesExpLogica4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegadaExpLogica4(ANegadaExpLogica4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentadoExpLogica4(AParentadoExpLogica4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentadonegadoExpLogica4(AParentadonegadoExpLogica4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualOpLogicos(AIgualOpLogicos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADifOpLogicos(ADifOpLogicos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenoriOpLogicos(AMenoriOpLogicos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaioriOpLogicos(AMaioriOpLogicos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOpLogicos(AMenorOpLogicos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOpLogicos(AMaiorOpLogicos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioPrograma(TInicioPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPrograma(TFimPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComecaPrograma(TComecaPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeiaConsole(TLeiaConsole node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscrevaConsole(TEscrevaConsole node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoReal(TTipoReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoInt(TTipoInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoChar(TTipoChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSoma(TSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubtracao(TSubtracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMulti(TMulti node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgualdade(TIgualdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferenca(TDiferenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNegacao(TNegacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConjuncao(TConjuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDisjuncao(TDisjuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDisjuncaoExc(TDisjuncaoExc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroInt(TNumeroInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentLinha(TComentLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspasS(TAspasS node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspasD(TAspasD node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParentese(TAbreParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParentese(TFechaParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBranco(TBranco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioFinal(TComentarioFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioMeio(TComentarioMeio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsterisco(TAsterisco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
