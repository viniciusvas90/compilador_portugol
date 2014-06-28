/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ATipoRealTipo extends PTipo
{
    private TTipoReal _tipoReal_;

    public ATipoRealTipo()
    {
        // Constructor
    }

    public ATipoRealTipo(
        @SuppressWarnings("hiding") TTipoReal _tipoReal_)
    {
        // Constructor
        setTipoReal(_tipoReal_);

    }

    @Override
    public Object clone()
    {
        return new ATipoRealTipo(
            cloneNode(this._tipoReal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoRealTipo(this);
    }

    public TTipoReal getTipoReal()
    {
        return this._tipoReal_;
    }

    public void setTipoReal(TTipoReal node)
    {
        if(this._tipoReal_ != null)
        {
            this._tipoReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoReal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoReal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoReal_ == child)
        {
            this._tipoReal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoReal_ == oldChild)
        {
            setTipoReal((TTipoReal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}