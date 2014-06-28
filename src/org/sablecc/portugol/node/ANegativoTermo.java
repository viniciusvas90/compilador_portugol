/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ANegativoTermo extends PTermo
{
    private TSubtracao _subtracao_;
    private PFator _fator_;

    public ANegativoTermo()
    {
        // Constructor
    }

    public ANegativoTermo(
        @SuppressWarnings("hiding") TSubtracao _subtracao_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setSubtracao(_subtracao_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new ANegativoTermo(
            cloneNode(this._subtracao_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANegativoTermo(this);
    }

    public TSubtracao getSubtracao()
    {
        return this._subtracao_;
    }

    public void setSubtracao(TSubtracao node)
    {
        if(this._subtracao_ != null)
        {
            this._subtracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subtracao_ = node;
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._subtracao_)
            + toString(this._fator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._subtracao_ == child)
        {
            this._subtracao_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._subtracao_ == oldChild)
        {
            setSubtracao((TSubtracao) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}