/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TLogOuExclusivo extends Token
{
    public TLogOuExclusivo()
    {
        super.setText("xor");
    }

    public TLogOuExclusivo(int line, int pos)
    {
        super.setText("xor");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLogOuExclusivo(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLogOuExclusivo(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLogOuExclusivo text.");
    }
}
