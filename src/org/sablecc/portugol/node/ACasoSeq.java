/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import java.util.*;
import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACasoSeq extends PCasoSeq
{
    private TCaso _caso_;
    private PValor _valor_;
    private TDoisPontos _doisPontos_;
    private final LinkedList<PComandoSeq> _comandoSeq_ = new LinkedList<PComandoSeq>();
    private PComando _comando_;
    private TPontoVirgula _pontoVirgula_;

    public ACasoSeq()
    {
        // Constructor
    }

    public ACasoSeq(
        @SuppressWarnings("hiding") TCaso _caso_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") List<?> _comandoSeq_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setCaso(_caso_);

        setValor(_valor_);

        setDoisPontos(_doisPontos_);

        setComandoSeq(_comandoSeq_);

        setComando(_comando_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ACasoSeq(
            cloneNode(this._caso_),
            cloneNode(this._valor_),
            cloneNode(this._doisPontos_),
            cloneList(this._comandoSeq_),
            cloneNode(this._comando_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACasoSeq(this);
    }

    public TCaso getCaso()
    {
        return this._caso_;
    }

    public void setCaso(TCaso node)
    {
        if(this._caso_ != null)
        {
            this._caso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caso_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TDoisPontos getDoisPontos()
    {
        return this._doisPontos_;
    }

    public void setDoisPontos(TDoisPontos node)
    {
        if(this._doisPontos_ != null)
        {
            this._doisPontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPontos_ = node;
    }

    public LinkedList<PComandoSeq> getComandoSeq()
    {
        return this._comandoSeq_;
    }

    public void setComandoSeq(List<?> list)
    {
        for(PComandoSeq e : this._comandoSeq_)
        {
            e.parent(null);
        }
        this._comandoSeq_.clear();

        for(Object obj_e : list)
        {
            PComandoSeq e = (PComandoSeq) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandoSeq_.add(e);
        }
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caso_)
            + toString(this._valor_)
            + toString(this._doisPontos_)
            + toString(this._comandoSeq_)
            + toString(this._comando_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caso_ == child)
        {
            this._caso_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._comandoSeq_.remove(child))
        {
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caso_ == oldChild)
        {
            setCaso((TCaso) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        for(ListIterator<PComandoSeq> i = this._comandoSeq_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandoSeq) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}