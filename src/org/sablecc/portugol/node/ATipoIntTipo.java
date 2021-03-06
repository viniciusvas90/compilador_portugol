/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ATipoIntTipo extends PTipo
{
    private TTipoInt _tipoInt_;

    public ATipoIntTipo()
    {
        // Constructor
    }

    public ATipoIntTipo(
        @SuppressWarnings("hiding") TTipoInt _tipoInt_)
    {
        // Constructor
        setTipoInt(_tipoInt_);

    }

    @Override
    public Object clone()
    {
        return new ATipoIntTipo(
            cloneNode(this._tipoInt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoIntTipo(this);
    }

    public TTipoInt getTipoInt()
    {
        return this._tipoInt_;
    }

    public void setTipoInt(TTipoInt node)
    {
        if(this._tipoInt_ != null)
        {
            this._tipoInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoInt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoInt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoInt_ == child)
        {
            this._tipoInt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoInt_ == oldChild)
        {
            setTipoInt((TTipoInt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
