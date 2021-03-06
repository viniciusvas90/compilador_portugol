/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.portugol.node;

import java.util.*;
import org.sablecc.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ARepitaComando extends PComando
{
    private TRepita _repita_;
    private final LinkedList<PComandoSeq> _comandoSeq_ = new LinkedList<PComandoSeq>();
    private PComando _comando_;
    private TPontoVirgula _meio_;
    private TAte _ate_;
    private TAbreParentese _abreParentese_;
    private PExpLogica _expLogica_;
    private TFechaParentese _fechaParentese_;
    private TPontoVirgula _fim_;

    public ARepitaComando()
    {
        // Constructor
    }

    public ARepitaComando(
        @SuppressWarnings("hiding") TRepita _repita_,
        @SuppressWarnings("hiding") List<?> _comandoSeq_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TPontoVirgula _meio_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") TAbreParentese _abreParentese_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TFechaParentese _fechaParentese_,
        @SuppressWarnings("hiding") TPontoVirgula _fim_)
    {
        // Constructor
        setRepita(_repita_);

        setComandoSeq(_comandoSeq_);

        setComando(_comando_);

        setMeio(_meio_);

        setAte(_ate_);

        setAbreParentese(_abreParentese_);

        setExpLogica(_expLogica_);

        setFechaParentese(_fechaParentese_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new ARepitaComando(
            cloneNode(this._repita_),
            cloneList(this._comandoSeq_),
            cloneNode(this._comando_),
            cloneNode(this._meio_),
            cloneNode(this._ate_),
            cloneNode(this._abreParentese_),
            cloneNode(this._expLogica_),
            cloneNode(this._fechaParentese_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepitaComando(this);
    }

    public TRepita getRepita()
    {
        return this._repita_;
    }

    public void setRepita(TRepita node)
    {
        if(this._repita_ != null)
        {
            this._repita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repita_ = node;
    }

    public LinkedList<PComandoSeq> getComandoSeq()
    {
        return this._comandoSeq_;
    }

    public void setComandoSeq(List<?> list)
    {
        for(PComandoSeq e : this._comandoSeq_)
        {
            e.parent(null);
        }
        this._comandoSeq_.clear();

        for(Object obj_e : list)
        {
            PComandoSeq e = (PComandoSeq) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandoSeq_.add(e);
        }
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TPontoVirgula getMeio()
    {
        return this._meio_;
    }

    public void setMeio(TPontoVirgula node)
    {
        if(this._meio_ != null)
        {
            this._meio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._meio_ = node;
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
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

    public TPontoVirgula getFim()
    {
        return this._fim_;
    }

    public void setFim(TPontoVirgula node)
    {
        if(this._fim_ != null)
        {
            this._fim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repita_)
            + toString(this._comandoSeq_)
            + toString(this._comando_)
            + toString(this._meio_)
            + toString(this._ate_)
            + toString(this._abreParentese_)
            + toString(this._expLogica_)
            + toString(this._fechaParentese_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repita_ == child)
        {
            this._repita_ = null;
            return;
        }

        if(this._comandoSeq_.remove(child))
        {
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._meio_ == child)
        {
            this._meio_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._abreParentese_ == child)
        {
            this._abreParentese_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._fechaParentese_ == child)
        {
            this._fechaParentese_ = null;
            return;
        }

        if(this._fim_ == child)
        {
            this._fim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._repita_ == oldChild)
        {
            setRepita((TRepita) newChild);
            return;
        }

        for(ListIterator<PComandoSeq> i = this._comandoSeq_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandoSeq) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._meio_ == oldChild)
        {
            setMeio((TPontoVirgula) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._abreParentese_ == oldChild)
        {
            setAbreParentese((TAbreParentese) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._fechaParentese_ == oldChild)
        {
            setFechaParentese((TFechaParentese) newChild);
            return;
        }

        if(this._fim_ == oldChild)
        {
            setFim((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
