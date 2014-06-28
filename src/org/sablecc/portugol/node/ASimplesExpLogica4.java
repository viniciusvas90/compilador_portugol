/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ASimplesExpLogica4 extends PExpLogica4
{
    private PExpLogica _expLogica_;

    public ASimplesExpLogica4()
    {
        // Constructor
    }

    public ASimplesExpLogica4(
        @SuppressWarnings("hiding") PExpLogica _expLogica_)
    {
        // Constructor
        setExpLogica(_expLogica_);

    }

    @Override
    public Object clone()
    {
        return new ASimplesExpLogica4(
            cloneNode(this._expLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimplesExpLogica4(this);
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
