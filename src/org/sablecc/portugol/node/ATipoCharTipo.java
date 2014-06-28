/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ATipoCharTipo extends PTipo
{
    private TTipoChar _tipoChar_;

    public ATipoCharTipo()
    {
        // Constructor
    }

    public ATipoCharTipo(
        @SuppressWarnings("hiding") TTipoChar _tipoChar_)
    {
        // Constructor
        setTipoChar(_tipoChar_);

    }

    @Override
    public Object clone()
    {
        return new ATipoCharTipo(
            cloneNode(this._tipoChar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoCharTipo(this);
    }

    public TTipoChar getTipoChar()
    {
        return this._tipoChar_;
    }

    public void setTipoChar(TTipoChar node)
    {
        if(this._tipoChar_ != null)
        {
            this._tipoChar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoChar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoChar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoChar_ == child)
        {
            this._tipoChar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoChar_ == oldChild)
        {
            setTipoChar((TTipoChar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}