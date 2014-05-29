/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TComentLinha extends Token
{
    public TComentLinha()
    {
        super.setText("//");
    }

    public TComentLinha(int line, int pos)
    {
        super.setText("//");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentLinha(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentLinha(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentLinha text.");
    }
}
