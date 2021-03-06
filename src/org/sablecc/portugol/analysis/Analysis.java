/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.analysis;

import org.sablecc.portugol.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseADeclVariavelDeclaracao(ADeclVariavelDeclaracao node);
    void caseADeclConstanteDeclaracao(ADeclConstanteDeclaracao node);
    void caseASequenciaVarVarSeq(ASequenciaVarVarSeq node);
    void caseAUnicaVarVarSeq(AUnicaVarVarSeq node);
    void caseATipoRealTipo(ATipoRealTipo node);
    void caseATipoIntTipo(ATipoIntTipo node);
    void caseATipoCharTipo(ATipoCharTipo node);
    void caseAVariavelSimplesVar(AVariavelSimplesVar node);
    void caseAVariavelArrayVar(AVariavelArrayVar node);
    void caseAInteiroValor(AInteiroValor node);
    void caseARealValor(ARealValor node);
    void caseAStringValor(AStringValor node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseALeiaComando(ALeiaComando node);
    void caseAEscrevaComando(AEscrevaComando node);
    void caseASeComando(ASeComando node);
    void caseAAvalieComando(AAvalieComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseARepitaComando(ARepitaComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaPassoComando(AParaPassoComando node);
    void caseAComandoSeq(AComandoSeq node);
    void caseACasoSeq(ACasoSeq node);
    void caseACasoSenao(ACasoSenao node);
    void caseAComSenaoSeDecl(AComSenaoSeDecl node);
    void caseASemSenaoSeDecl(ASemSenaoSeDecl node);
    void caseAComOpExp(AComOpExp node);
    void caseASemOpExp(ASemOpExp node);
    void caseAComOp2Termo(AComOp2Termo node);
    void caseASemOp2Termo(ASemOp2Termo node);
    void caseANegativoTermo(ANegativoTermo node);
    void caseAEmparentadoFator(AEmparentadoFator node);
    void caseAConstanteFator(AConstanteFator node);
    void caseAVariavelFator(AVariavelFator node);
    void caseASomaOp(ASomaOp node);
    void caseASubtracaoOp(ASubtracaoOp node);
    void caseAMultiplicacaoOp2(AMultiplicacaoOp2 node);
    void caseADivisaoOp2(ADivisaoOp2 node);
    void caseASequenciaExpExpSeq(ASequenciaExpExpSeq node);
    void caseAUnicaExpExpSeq(AUnicaExpExpSeq node);
    void caseAExpLogica(AExpLogica node);
    void caseADisjuncaoExpLogica2(ADisjuncaoExpLogica2 node);
    void caseADisjuncaoxExpLogica2(ADisjuncaoxExpLogica2 node);
    void caseASimplesExpLogica2(ASimplesExpLogica2 node);
    void caseAConjuncaoExpLogica3(AConjuncaoExpLogica3 node);
    void caseASimplesExpLogica3(ASimplesExpLogica3 node);
    void caseASimplesExpLogica4(ASimplesExpLogica4 node);
    void caseANegadaExpLogica4(ANegadaExpLogica4 node);
    void caseAParentadoExpLogica4(AParentadoExpLogica4 node);
    void caseAParentadonegadoExpLogica4(AParentadonegadoExpLogica4 node);
    void caseAIgualOpLogicos(AIgualOpLogicos node);
    void caseADifOpLogicos(ADifOpLogicos node);
    void caseAMenoriOpLogicos(AMenoriOpLogicos node);
    void caseAMaioriOpLogicos(AMaioriOpLogicos node);
    void caseAMenorOpLogicos(AMenorOpLogicos node);
    void caseAMaiorOpLogicos(AMaiorOpLogicos node);

    void caseTInicioPrograma(TInicioPrograma node);
    void caseTFimPrograma(TFimPrograma node);
    void caseTComecaPrograma(TComecaPrograma node);
    void caseTConstante(TConstante node);
    void caseTLeiaConsole(TLeiaConsole node);
    void caseTEscrevaConsole(TEscrevaConsole node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTFimSe(TFimSe node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTEnquanto(TEnquanto node);
    void caseTFaca(TFaca node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTFimPara(TFimPara node);
    void caseTPasso(TPasso node);
    void caseTTipoReal(TTipoReal node);
    void caseTTipoInt(TTipoInt node);
    void caseTTipoChar(TTipoChar node);
    void caseTSoma(TSoma node);
    void caseTSubtracao(TSubtracao node);
    void caseTMulti(TMulti node);
    void caseTDiv(TDiv node);
    void caseTIgualdade(TIgualdade node);
    void caseTDiferenca(TDiferenca node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenor(TMenor node);
    void caseTMaior(TMaior node);
    void caseTNegacao(TNegacao node);
    void caseTConjuncao(TConjuncao node);
    void caseTDisjuncao(TDisjuncao node);
    void caseTDisjuncaoExc(TDisjuncaoExc node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTId(TId node);
    void caseTNumeroInt(TNumeroInt node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTString(TString node);
    void caseTComentLinha(TComentLinha node);
    void caseTVirgula(TVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTAspasS(TAspasS node);
    void caseTAspasD(TAspasD node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTAbreParentese(TAbreParentese node);
    void caseTFechaParentese(TFechaParentese node);
    void caseTBranco(TBranco node);
    void caseTComentarioBloco(TComentarioBloco node);
    void caseTComentarioFinal(TComentarioFinal node);
    void caseTComentarioMeio(TComentarioMeio node);
    void caseTBarra(TBarra node);
    void caseTAsterisco(TAsterisco node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
