/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class AEmparentadoFator extends PFator
{
    private TAbreParentese _abreParentese_;
    private PExp _exp_;
    private TFechaParentese _fechaParentese_;

    public AEmparentadoFator()
    {
        // Constructor
    }

    public AEmparentadoFator(
        @SuppressWarnings("hiding") TAbreParentese _abreParentese_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TFechaParentese _fechaParentese_)
    {
        // Constructor
        setAbreParentese(_abreParentese_);

        setExp(_exp_);

        setFechaParentese(_fechaParentese_);

    }

    @Override
    public Object clone()
    {
        return new AEmparentadoFator(
            cloneNode(this._abreParentese_),
            cloneNode(this._exp_),
            cloneNode(this._fechaParentese_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmparentadoFator(this);
    }

    public TAbreParentese getAbreParentese()
    {
        return this._abreParentese_;
    }

    public void setAbreParentese(TAbreParentese node)
    {
        if(this._abreParentese_ != null)
        {
            this._abreParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParentese_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TFechaParentese getFechaParentese()
    {
        return this._fechaParentese_;
    }

    public void setFechaParentese(TFechaParentese node)
    {
        if(this._fechaParentese_ != null)
        {
            this._fechaParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParentese_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._abreParentese_)
            + toString(this._exp_)
            + toString(this._fechaParentese_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._abreParentese_ == child)
        {
            this._abreParentese_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._fechaParentese_ == child)
        {
            this._fechaParentese_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._abreParentese_ == oldChild)
        {
            setAbreParentese((TAbreParentese) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._fechaParentese_ == oldChild)
        {
            setFechaParentese((TFechaParentese) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
