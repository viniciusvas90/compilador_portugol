/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplicacaoOp2 extends POp2
{
    private TMulti _multi_;

    public AMultiplicacaoOp2()
    {
        // Constructor
    }

    public AMultiplicacaoOp2(
        @SuppressWarnings("hiding") TMulti _multi_)
    {
        // Constructor
        setMulti(_multi_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplicacaoOp2(
            cloneNode(this._multi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicacaoOp2(this);
    }

    public TMulti getMulti()
    {
        return this._multi_;
    }

    public void setMulti(TMulti node)
    {
        if(this._multi_ != null)
        {
            this._multi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multi_ == child)
        {
            this._multi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multi_ == oldChild)
        {
            setMulti((TMulti) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
