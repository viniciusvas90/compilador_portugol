/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TDisjuncao extends Token
{
    public TDisjuncao()
    {
        super.setText("ou");
    }

    public TDisjuncao(int line, int pos)
    {
        super.setText("ou");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDisjuncao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDisjuncao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDisjuncao text.");
    }
}
