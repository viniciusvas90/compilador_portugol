/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ADifOpLogicos extends POpLogicos
{
    private TDiferenca _diferenca_;

    public ADifOpLogicos()
    {
        // Constructor
    }

    public ADifOpLogicos(
        @SuppressWarnings("hiding") TDiferenca _diferenca_)
    {
        // Constructor
        setDiferenca(_diferenca_);

    }

    @Override
    public Object clone()
    {
        return new ADifOpLogicos(
            cloneNode(this._diferenca_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADifOpLogicos(this);
    }

    public TDiferenca getDiferenca()
    {
        return this._diferenca_;
    }

    public void setDiferenca(TDiferenca node)
    {
        if(this._diferenca_ != null)
        {
            this._diferenca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._diferenca_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._diferenca_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._diferenca_ == child)
        {
            this._diferenca_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._diferenca_ == oldChild)
        {
            setDiferenca((TDiferenca) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}